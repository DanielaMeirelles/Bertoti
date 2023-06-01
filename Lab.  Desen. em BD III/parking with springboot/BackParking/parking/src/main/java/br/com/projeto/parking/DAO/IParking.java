package br.com.projeto.parking.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.parking.model.Parking;

public interface IParking extends CrudRepository<Parking, Integer> {

}
