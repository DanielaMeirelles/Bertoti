package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/carro")
class Model {
	private List<Carro> carros = new LinkedList<Carro>();

	public Model() {
		postCarro(new Carro("AAA1111", new Especificacao("Gol", "VW", "verde")));
		postCarro(new Carro("BBB2222", new Especificacao("Uno", "Fiat", "vermelho")));
		postCarro(new Carro("CCC3333", new Especificacao("Chevete", "GM", "cinza")));
	}
	

	@GetMapping
	Iterable<Carro> getCarros() {
		return carros;
	}

	@GetMapping("/{placa}")
	Optional<Carro> getCarroByPlaca(@PathVariable String placa) {
		for (Carro carro: carros) {
			if(carro.getPlaca().equals(placa)) return Optional.of(carro);
			}
		{

		return null;
		}
	}

	@PostMapping
	Carro postCarro(@RequestBody Carro carro) {
		carros.add(carro);
		return carro;
	}

	@PutMapping("/{placa}")
	ResponseEntity<Carro> putCarro(@PathVariable String placa,
									 @RequestBody Carro carro) {
		int carroIndex = -1;

		for (Carro car: carros) {
			if (car.getPlaca().equals(placa)) {
				carroIndex = carros.indexOf(car);
				carros.set(carroIndex, car);
			}
		}

		return (carroIndex == -1) ?
				new ResponseEntity<>(postCarro(carro), HttpStatus.CREATED) :
				new ResponseEntity<>(carro, HttpStatus.OK);
	}

	@DeleteMapping("/{placa}")
	void deleteCarro(@PathVariable String placa) {
		carros.removeIf(carro -> carro.getPlaca().equals(placa));
	}
}

class Carro {
	private String placa;
	private Especificacao espc;

	public Carro(String placa, Especificacao espc) {
		this.placa = placa;
		this.espc = espc;
	}

	public String getPlaca() {
		return this.placa;
	}

	public Especificacao getEspc() {
		return espc;
	}
}
class Especificacao {
	private String modelo;
	private String marca;
	private String cor;
	
	
	public Especificacao(String modelo, String marca, String cor){
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getCor(){
		return cor;
	}
	
	//delegacao da comparacao de marca, modelo e cor do carro para a classe Especificacao, pois ela eh a dona dos atributos
	public boolean comparar(Especificacao esp){
		if(modelo.equals(esp.modelo)){
			return true;
		} else {
			return false;
		}
	}
}
