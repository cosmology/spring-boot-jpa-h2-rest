package com.ivanprkic.crud.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("The book id '" + id + "' does not exist in our records");
    }
}
