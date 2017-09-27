package com.example.firstconsumer.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author: fabian.wilms
 */
public class MyReducedEntity {

    private String message;

    private int importantNumber;

    public MyReducedEntity(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImportantNumber() {
        return importantNumber;
    }

    public void setImportantNumber(int importantNumber) {
        this.importantNumber = importantNumber;
    }
}
