package com.server.resource.pessoa;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PessoaMapper {
	
	PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    PessoaDto pessoaToPessoaDto(Pessoa pessoa);
    List<PessoaDto> pessoasToPessoasDto(List<Pessoa> pessoas);

    Pessoa pessoaDtoToPessoa(PessoaDto pessoaDto);
    List<Pessoa> pessoasDtoToPessoas(List<PessoaDto> pessoasDto);

}
