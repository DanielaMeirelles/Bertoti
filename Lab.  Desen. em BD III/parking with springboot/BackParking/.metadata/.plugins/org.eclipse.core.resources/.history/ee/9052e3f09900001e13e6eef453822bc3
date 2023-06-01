package br.com.projeto.parking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.parking.DAO.IParking;
import br.com.projeto.parking.model.Parking;

@RestController
@CrossOrigin("*")
@RequestMapping("/carro")
public class ParkingController {
	
	@Autowired
	private IParking dao;
	
	@GetMapping
	public List<Parking> listaCarros () {
		return (List<Parking>) dao.findAll() ;
	}
	
	@PostMapping
	public Parking criarCarro (@RequestBody Parking parking) {
		Parking parkingNovo = dao.save(parking);
		return parkingNovo;
	}
	
	@PutMapping
	public Parking editarCarro (@RequestBody Parking parking) {
		Parking parkingNovo = dao.save(parking);
		return parkingNovo;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Parking> excluirCarro (@PathVariable Integer id) {
		Optional<Parking> parking = dao.findById(id);
		dao.deleteById(id);
		return parking;
	}
}
