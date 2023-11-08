package com.oreilly.doanswer;

import java.util.AbstractList;

public class MyList extends AbstractList<String> {

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException(); // TODO
    }

    @Override
    public void add(int index, String element) {
        // no-op
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException(); // TODO
    }
}