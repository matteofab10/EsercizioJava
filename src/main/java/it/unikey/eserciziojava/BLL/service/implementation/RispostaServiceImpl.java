package it.unikey.eserciziojava.BLL.service.implementation;

import it.unikey.eserciziojava.BLL.dto.response.RispostaResponseDTO;
import it.unikey.eserciziojava.BLL.mapper.implementation.RispostaResponseMapper;
import it.unikey.eserciziojava.BLL.service.abstraction.RispostaService;
import it.unikey.eserciziojava.DAL.entity.Risposta;
import it.unikey.eserciziojava.DAL.repository.RispostaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RispostaServiceImpl implements RispostaService {

    private final RispostaRepository rispostaRepository;
    private final RispostaResponseMapper rispostaResponseMapper;
    @Override
    public List<RispostaResponseDTO> listRightAnswers() {
        List<Risposta> listaRisposte = rispostaRepository.findAll();
        List<Risposta> listaRisposteCorrette = new ArrayList<>();
        for (Risposta r : listaRisposte) {
            if (r.isRispostaGiusta()){
                listaRisposteCorrette.add(r);
            }
        }
        return rispostaResponseMapper.asDTOList(listaRisposteCorrette);
    }
}
