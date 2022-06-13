package it.unikey.eserciziojava.BLL.mapper.implementation;

import it.unikey.eserciziojava.BLL.dto.request.DomandaRequestDTO;
import it.unikey.eserciziojava.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.eserciziojava.DAL.entity.Domanda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomandaRequestMapper extends GenericRequestMapper<Domanda, DomandaRequestDTO> {
}
