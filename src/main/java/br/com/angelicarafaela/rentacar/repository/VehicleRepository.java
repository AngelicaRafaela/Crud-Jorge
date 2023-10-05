package br.com.matheusbales.rentacar.repository;

import br.com.matheusbales.rentacar.model.CustomerModel;
import br.com.matheusbales.rentacar.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Integer> {
}
