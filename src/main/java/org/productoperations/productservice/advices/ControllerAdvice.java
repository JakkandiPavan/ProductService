package org.productoperations.productservice.advices;

import org.productoperations.productservice.dtos.ErrorDTO;
import org.productoperations.productservice.exceptions.ProductNotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(ProductNotFoundExceptions.class)
    public ResponseEntity<ErrorDTO> handleProductNotFoundExceptions(ProductNotFoundExceptions productNotFoundExceptions) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setMessage(productNotFoundExceptions.getMessage());

        ResponseEntity<ErrorDTO> responseEntity = new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
        return responseEntity;
    }


}
