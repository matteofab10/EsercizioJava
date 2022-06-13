package it.unikey.eserciziojava.BLL.dto.response;

import lombok.Data;

@Data
public class RispostaResponseDTO {

    private Long id;
    private boolean rispostaGiusta;
    private String contenutoRisposta;
    private DomandaResponseDTO domandaResponseDTO;
}
