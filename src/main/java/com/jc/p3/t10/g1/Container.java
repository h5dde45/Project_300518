package com.jc.p3.t10.g1;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private /*static*/ final List<String> list = new ArrayList<>();

    synchronized void addEntry(String s) {
        list.add(s);
    }

    public int size() {
        return list.size();
    }
}
