package com.example.lesson1.jvm.task3;

public abstract class Task3TestClass {
    private static int objectCounter = 0;
    private final int index;
    private final String id;
    private final String name;

    public Task3TestClass(String id, String name) {
        this.index = objectCounter++;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return id;
    }

    public int getIndex() {
        return index;
    }

    abstract void sayHello();
}
