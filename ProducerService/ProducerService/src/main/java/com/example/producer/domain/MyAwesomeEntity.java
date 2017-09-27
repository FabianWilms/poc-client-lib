package com.example.producer.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.LocalDateTime;

/**
 * @author: fabian.wilms
 */
public class MyAwesomeEntity {

    public MyAwesomeEntity(String message, int importantNumber, LocalDateTime dateTime) {
        this.message = message;
        this.importantNumber = importantNumber;
        this.dateTime = dateTime;
    }

    private String message;

    private int importantNumber;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime dateTime;

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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
