package br.com.matheusbales.rentacar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "vehicle")

public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model_name", nullable = false, length = 50)
    private String modelName;

    @Column(name = "assembler", nullable = false, length = 50)
    private String assembler;

    @Column(name = "manufacture_year", nullable = false)
    private int manufactureYear;

    @Column(name = "model_year", nullable = false, length =  50)
    private int modelYear;
}
