package it.unikey.eserciziojava.BLL.service.abstraction;


import it.unikey.eserciziojava.BLL.dto.request.RispostaRequestDTO;
import it.unikey.eserciziojava.BLL.dto.response.RispostaResponseDTO;

import java.util.List;

public interface RispostaService {

    void saveRisposta (RispostaRequestDTO rispostaRequestDTO);

    void deleteById (Long id);

    RispostaResponseDTO findById(Long id);

    RispostaResponseDTO findAll();

    List<RispostaResponseDTO> listaRisposteGiuste();
}
