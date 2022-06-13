package it.unikey.eserciziojava.BLL.service.abstraction;

import it.unikey.eserciziojava.BLL.dto.request.DomandaRequestDTO;
import it.unikey.eserciziojava.BLL.dto.response.DomandaResponseDTO;

import java.util.List;

public interface DomandaService {

    void saveDomanda (DomandaRequestDTO domandaRequestDTO);

    void deleteById (Long id);

    DomandaResponseDTO findById(Long id);

    List<DomandaResponseDTO> findAll();

    List<DomandaResponseDTO> listaDomande();
}
