package it.unikey.eserciziojava.BLL.dto.response;

import it.unikey.eserciziojava.DAL.entity.StatoDomanda;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DomandaResponseDTO {

    private Long id;
    private StatoDomanda statoDomanda;
    private boolean domandaObbligatoria;
    private LocalDate dataSomministrazione;
    private String contenutoDomanda;
    private List<RispostaResponseDTO> rispostaResponseDTOList;

}
