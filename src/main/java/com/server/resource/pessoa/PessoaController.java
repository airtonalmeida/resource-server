package com.server.resource.pessoa;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaController {
	
	private PessoaService pessoaService;	
	

	private PessoaController(PessoaService pessoaService) {		
		this.pessoaService = pessoaService;
	}
	
	 @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public PessoaDto salvar(@RequestBody PessoaDto pessoaDto) {		
		 		
		return pessoaService.saveCreate(pessoaDto);		
		
	}
}
