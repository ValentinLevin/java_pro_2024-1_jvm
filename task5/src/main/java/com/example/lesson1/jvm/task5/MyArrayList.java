package com.example.lesson1.jvm.task5;

import java.util.ArrayList;
import java.util.logging.Logger;

public class MyArrayList extends ArrayList<Task5TestClass> {
    private static int objectIndex = 1;

    private int index;
    private static final Logger log = Logger.getLogger(MyArrayList.class.getName());

    public MyArrayList() {
        this.index = objectIndex++;
        log.info("Creation. # " + index);
    }

    public int getIndex() {
        return index;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize. Object # " + index);
        super.finalize();
    }
}
