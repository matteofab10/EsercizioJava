package it.unikey.eserciziojava.BLL.dto.request;

import it.unikey.eserciziojava.DAL.entity.StatoDomanda;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DomandaRequestDTO {

    private StatoDomanda statoDomanda;
    private boolean domandaObbligatoria;
    private LocalDate dataSomministrazione;
    private String contenutoDomanda;
    private List<RispostaRequestDTO> rispostaRequestDTOList;
}
