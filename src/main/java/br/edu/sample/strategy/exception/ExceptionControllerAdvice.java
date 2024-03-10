package br.edu.sample.strategy.exception;


import br.edu.sample.strategy.exception.response.ErrorResponse;
import br.edu.sample.strategy.exception.response.ErrorResponseBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler({BadRequestException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse enumException(Exception exception) {

        return ErrorResponseBuilder.builder()
                .withDescription(exception.getMessage())
                .withError("Bad Request")
                .build();

    }
}
