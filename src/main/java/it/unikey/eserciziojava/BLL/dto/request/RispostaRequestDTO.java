package it.unikey.eserciziojava.BLL.dto.request;

import lombok.Data;

@Data
public class RispostaRequestDTO {

    private boolean rispostaGiusta;
    private String contenutoRisposta;
    private DomandaRequestDTO domandaRequestDTO;
}
