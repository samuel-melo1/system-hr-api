package br.com.samuel.payrollapi.resources.exceptions;


import br.com.samuel.payrollapi.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException object, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).
                body(new StandardError(LocalDateTime.now(),
                        object.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        request.getRequestURI())
                );
    }
}
