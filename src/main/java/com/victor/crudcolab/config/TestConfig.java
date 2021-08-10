package com.victor.crudcolab.config;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.victor.crudcolab.domain.Colaborador;
import com.victor.crudcolab.repositories.ColaboradorRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ColaboradorRepository repository;
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 


	@Override
	public void run(String... args) throws Exception {
	
		Colaborador c1 = new Colaborador(null, "José", "dos Santos", "Operador de Caixa", "08/05/1995", "R. Miguel Casagrande, 200 - Freguesia do Ó, São Paulo - SP, 02714-000");
		Colaborador c2 = new Colaborador(null, "Maria", "da Silva", "Estoquista", "20/01/1994", "Av. Angélica, 2565 - Bela Vista, São Paulo - SP, 01227-200");
		Colaborador c3 = new Colaborador(null, "Bruno", "Conceição", "Gerente", "18/03/1990", "R. Antônio Macedo, 505 - Parque São Jorge, São Paulo - SP, 03087-010");
		Colaborador c4 = new Colaborador(null, "Matheus", "de Melo", "Atendente", "29/10/1997", "Av. do Café, 130 - Vila Guarani, São Paulo - SP, 04311-000");
		Colaborador c5 = new Colaborador(null, "Fernanda", "de Carvalho", "Analista", "30/01/1992", "Rua Achilles Orlando Curtolo, 499 - Prédio III - Barra Funda, São Paulo - SP, 01144-080");
		
		repository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
		
	}

}
