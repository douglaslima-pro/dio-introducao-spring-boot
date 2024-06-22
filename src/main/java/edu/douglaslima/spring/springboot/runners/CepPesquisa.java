package edu.douglaslima.spring.springboot.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

import edu.douglaslima.spring.springboot.model.CepPesquisaApi;
import edu.douglaslima.spring.springboot.model.CepResponse;
import edu.douglaslima.spring.springboot.model.ConversorJson;

import java.util.Scanner;

@Component
@Order(2)
public class CepPesquisa implements CommandLineRunner {

	@Autowired
	private CepPesquisaApi cepPesquisaApi;

	@Autowired
	private ConversorJson conversorJson;

	@Autowired
	private Scanner scanner;

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		System.out.print("Digite o cep: ");
		String cep = scanner.next();
		String json = cepPesquisaApi.pesquisarCep(cep);
		CepResponse cepResponse = conversorJson.toCepResponse(json);
		System.out.println();
		if (cepResponse != null) {
			System.out.println("Dados do CEP encontrado:");
			System.out.println(String.format("- cep: \"%s\"", cepResponse.getCep()));
			System.out.println(String.format("- uf: \"%s\"", cepResponse.getUf()));
			System.out.println(String.format("- cidade: \"%s\"", cepResponse.getCidade()));
			System.out.println(String.format("- bairro: \"%s\"", cepResponse.getBairro()));
			System.out.println(String.format("- logradouro: \"%s\"", cepResponse.getLogradouro()));
			System.out.println(String.format("- complemento: \"%s\"", cepResponse.getComplemento()));
		} else {
			System.out.println("Nenhum CEP foi encontrado!");
		}
	}

}
