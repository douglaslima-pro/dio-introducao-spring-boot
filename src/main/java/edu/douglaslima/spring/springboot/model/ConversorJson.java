package edu.douglaslima.spring.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;


@Component
public class ConversorJson {
	
	@Autowired
	private Gson gson;
	
	public CepResponse toCepResponse(String json) {
		return gson.fromJson(json, CepResponse.class);
	}

}
