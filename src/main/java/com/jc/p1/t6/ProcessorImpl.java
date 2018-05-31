package com.jc.p1.t6;

public class ProcessorImpl implements Processor {
    @Override
    public String process(String code, String name) {
        return code + " : " + name;
    }
}
