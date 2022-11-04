package com.server.resource.pessoa;

import org.springframework.stereotype.Service;

@Service
public class PessoaService {	
	
	private PessoaRepository pessoaRepository;
	
	private PessoaService(PessoaRepository pessoaRepository) {
		
		this.pessoaRepository = pessoaRepository;
	}	
	
	public PessoaDto saveCreate(PessoaDto pessoaDto) {	
		pessoaDto.setId(null);
		return save(pessoaDto);
	}
	
	public PessoaDto save(PessoaDto pessoaDto) { 		
		
        Pessoa pessoa = PessoaMapper.INSTANCE.pessoaDtoToPessoa(pessoaDto);
        Pessoa save = pessoaRepository.save(pessoa);

        return PessoaMapper.INSTANCE.pessoaToPessoaDto(save);
    }

}
