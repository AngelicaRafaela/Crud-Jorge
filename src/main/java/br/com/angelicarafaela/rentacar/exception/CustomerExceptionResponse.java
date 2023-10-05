package br.com.matheusbales.rentacar.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CustomerExceptionResponse {

    private Date timeStamp;

    private String message;

    private String details;

}
