package br.com.angelicarafaela.rentacar.repository;

import br.com.angelicarafaela.rentacar.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {




}
