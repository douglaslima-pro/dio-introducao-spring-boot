package edu.douglaslima.spring.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class CepPesquisaApi {

	public String pesquisarCep(String cep) {
		return "{"
				+ "\"cep\": \"72320-200\","
				+ "\"uf\": \"DF\","
				+ "\"cidade\": \"Brasília\","
				+ "\"bairro\": \"Samambaia Norte (Samambaia)\","
				+ "\"logradouro\": \"Quadra 414\","
				+ "\"complemento\": \"Centro de Ensino Médio 414\""
				+ "}";
	}
	
}
