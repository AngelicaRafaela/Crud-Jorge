package br.com.angelicarafaela.rentacar.repository;

import br.com.angelicarafaela.rentacar.model.CustomerModel;
import br.com.angelicarafaela.rentacar.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Integer> {
}
