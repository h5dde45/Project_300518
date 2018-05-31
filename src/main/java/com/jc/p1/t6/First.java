package com.jc.p1.t6;

import java.io.Serializable;

public class First implements Serializable {
    private String firstCode;
    private String firstName;
    private transient Processor processor;

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "First{" +
                "firstCode='" + firstCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", processor=" + processor +
                '}';
    }
}
