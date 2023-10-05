package br.com.matheusbales.rentacar.controller;


import br.com.matheusbales.rentacar.dto.CustomerDTO;
import br.com.matheusbales.rentacar.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")

@Tag(name = "Customers", description = "This endpoint manages Customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public CustomerDTO create(@RequestBody CustomerDTO dto){
        return service.create(dto);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Persists a new Customer in database", tags = {"Customer"}, responses = {
            @ApiResponse(description = "Success!", responseCode = "200", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CustomerDTO.class))
            }),
            @ApiResponse(description = "Bad Request!", responseCode = "400", content = {@Content}),
            @ApiResponse(description = "Unauthorized!", responseCode = "401", content = {@Content}),
            @ApiResponse(description = "Internal Error!", responseCode = "500", content = {@Content})
    })
    public CustomerDTO findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @GetMapping
    public List<CustomerDTO> findAll(){
        return service.findAll();
    }

    @PutMapping
    public CustomerDTO update(@RequestBody CustomerDTO dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
        CustomerDTO dto = service.findById(id);
        service.delete(dto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }





}
