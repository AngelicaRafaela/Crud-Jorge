package br.com.angelicarafaela.rentacar.controller;

import br.com.angelicarafaela.rentacar.dto.CustomerDTO;
import br.com.angelicarafaela.rentacar.dto.VehicleDTO;
import br.com.angelicarafaela.rentacar.service.CustomerService;
import br.com.angelicarafaela.rentacar.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService service;

    @PostMapping
    public VehicleDTO create(@RequestBody VehicleDTO dto){
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public VehicleDTO findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @GetMapping
    public List<VehicleDTO> findAll(){
        return service.findAll();
    }

    @PutMapping
    public VehicleDTO update(@RequestBody VehicleDTO dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
        VehicleDTO dto = service.findById(id);
        service.delete(dto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
