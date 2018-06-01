package com.jc.p1.t8;

import com.jc.p1.t6.Processor;

import java.io.Serializable;

public class First implements Serializable {

    private static final long serialVersionUID = 199L;

    private String firstCode;
//    private String firstOther;
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

//    public String getFirstOther() {
//        return firstOther;
//    }
//
//    public void setFirstOther(String firstOther) {
//        this.firstOther = firstOther;
//    }

    @Override
    public String toString() {
        return "First{" +
                "firstCode='" + firstCode + '\'' +
//                ", firstOther='" + firstOther + '\'' +
                ", firstName='" + firstName + '\'' +
                ", processor=" + processor +
                '}';
    }
}
