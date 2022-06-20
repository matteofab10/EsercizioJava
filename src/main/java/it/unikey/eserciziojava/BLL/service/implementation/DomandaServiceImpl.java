package it.unikey.eserciziojava.BLL.service.implementation;

import it.unikey.eserciziojava.BLL.dto.response.DomandaResponseDTO;
import it.unikey.eserciziojava.BLL.mapper.implementation.DomandaResponseMapper;
import it.unikey.eserciziojava.BLL.service.abstraction.DomandaService;
import it.unikey.eserciziojava.DAL.entity.Domanda;
import it.unikey.eserciziojava.DAL.repository.DomandaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DomandaServiceImpl implements DomandaService {

    private final DomandaRepository domandaRepository;
    private final DomandaResponseMapper domandaResponseMapper;

    @Override
    public List<DomandaResponseDTO> allActiveRequests() {
        List<Domanda> listaDomande = domandaRepository.findAll();
        List<Domanda> listaDomandeAttive = new ArrayList<>();
        for (Domanda d : listaDomande) {
            if (d.getStatoDomanda().toString().equalsIgnoreCase("attivo")) {
                listaDomandeAttive.add(d);
            }
        }
        return domandaResponseMapper.asDTOList(listaDomandeAttive);
    }

    @Override
    public List<DomandaResponseDTO> allRequestsWithThreeAnswers() {
        List<Domanda> listaDomande = domandaRepository.findAll();
        List<Domanda> listaDomandeConRisposta = new ArrayList<>();
        for (Domanda d : listaDomande ) {
            boolean b =  d.getRisposta().size() >= 3;
            if (b){
                listaDomandeConRisposta.add(d);
            }
        }
        return domandaResponseMapper.asDTOList(listaDomandeConRisposta);
    }

    @Override
    public List<DomandaResponseDTO> allRequestsMandatoryWithFourAnswers() {
        List<Domanda> listaDomande = domandaRepository.findAll();
        List<Domanda> listaDomandeObbligatorie = new ArrayList<>();
        for (Domanda d : listaDomande ) {
            if (d.isDomandaObbligatoria() && d.getRisposta().size() >= 4) {
                listaDomandeObbligatorie.add(d);
            }
        }
        return domandaResponseMapper.asDTOList(listaDomandeObbligatorie);
    }

    @Override
    public List<DomandaResponseDTO> allRequestsFromCasualDate() {
        List<Domanda> listaDomande = domandaRepository.findAll();
        List<Domanda> listaDomandeDopoDataCasuale = new ArrayList<>();
        LocalDate dataX = LocalDate.of(2022, 06, 01);
        for (Domanda d : listaDomande ) {
            if(d.getDataSomministrazione().compareTo(dataX) == 1){
                listaDomandeDopoDataCasuale.add(d);
            }
        }
        return domandaResponseMapper.asDTOList(listaDomandeDopoDataCasuale);
    }
}
