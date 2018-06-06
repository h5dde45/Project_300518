package com.jc.p3.t10;

import java.util.ArrayList;
import java.util.List;

public class Container {
    public static final List<String> list = new ArrayList<>();

    synchronized void addEntry(String s) {
        list.add(s);
    }
}
