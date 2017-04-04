package demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Could not find orders of user id " + id);
    }
}