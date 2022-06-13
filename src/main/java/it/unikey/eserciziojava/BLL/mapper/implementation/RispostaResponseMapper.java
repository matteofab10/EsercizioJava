package it.unikey.eserciziojava.BLL.mapper.implementation;

import it.unikey.eserciziojava.BLL.dto.response.RispostaResponseDTO;
import it.unikey.eserciziojava.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.eserciziojava.DAL.entity.Risposta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RispostaResponseMapper extends GenericResponseMapper<Risposta, RispostaResponseDTO> {
}
