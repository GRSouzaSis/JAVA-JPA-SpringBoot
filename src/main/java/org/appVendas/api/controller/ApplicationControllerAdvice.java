package org.appVendas.api.controller;

import org.appVendas.api.ApiErrors;
import org.appVendas.exception.PedidoNaoEncontradoException;
import org.appVendas.exception.RegraNegocioException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class ApplicationControllerAdvice {
    @ExceptionHandler(RegraNegocioException.class)
    @ResponseStatus(BAD_REQUEST)
    public ApiErrors handleRegraNegocioException(RegraNegocioException exception){
        String messageErro = exception.getMessage();
        return new ApiErrors(messageErro);
    }

    @ExceptionHandler(PedidoNaoEncontradoException.class)
    @ResponseStatus(NOT_FOUND)
    public ApiErrors handlePedidoNotFoundException( PedidoNaoEncontradoException ex ){
        return new ApiErrors(ex.getMessage());
    }
}
