package com.self.exception;

public class NotYetImplementedException extends RuntimeException {
    public NotYetImplementedException(String message) {
        super(message);
    }

    public NotYetImplementedException() {
        this("Not Yet Implemented");
    }
}
