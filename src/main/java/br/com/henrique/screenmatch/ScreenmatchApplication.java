package br.com.henrique.screenmatch;

import br.com.henrique.screenmatch.model.DadosSerie;
import br.com.henrique.screenmatch.services.ConsumoApi;
import br.com.henrique.screenmatch.services.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


		var consumoApi = new ConsumoApi();

		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=a73ba8d7");
		System.out.println(json);
		ConverterDados converter = new ConverterDados();
		DadosSerie dados = converter.obterDados(json, DadosSerie.class);
		System.out.println(dados);


	}


}
