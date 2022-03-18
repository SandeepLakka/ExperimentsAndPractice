package com.self.serialization;

import java.io.Serializable;

public class TestObject implements Serializable {

    private static final long serialVersionUID = 200L;
    private static long id;
    private String firstName = "John";
    private String lastName = "Doe";

    public long getId() {
        return ++id;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);

    }
}
