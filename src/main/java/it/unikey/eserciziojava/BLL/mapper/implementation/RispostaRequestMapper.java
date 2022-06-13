package it.unikey.eserciziojava.BLL.mapper.implementation;

import it.unikey.eserciziojava.BLL.dto.request.RispostaRequestDTO;
import it.unikey.eserciziojava.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.eserciziojava.DAL.entity.Risposta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RispostaRequestMapper extends GenericRequestMapper<Risposta, RispostaRequestDTO> {
}
