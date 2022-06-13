package it.unikey.eserciziojava.BLL.mapper.implementation;

import it.unikey.eserciziojava.BLL.dto.response.DomandaResponseDTO;
import it.unikey.eserciziojava.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.eserciziojava.DAL.entity.Domanda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomandaResponseMapper extends GenericResponseMapper<Domanda, DomandaResponseDTO> {
}
