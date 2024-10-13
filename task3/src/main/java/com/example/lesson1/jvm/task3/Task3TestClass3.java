package com.example.lesson1.jvm.task3;

public class Task3TestClass3 extends Task3TestClass{
    private String parentId;

    public Task3TestClass3(String parentId, String id, String name) {
        super(id, name);
        this.parentId = parentId;
    }

    public void sayHello() {
        System.out.println("Hello from object with name " + getName());
        PrintStackUtil.printStackTrace("Task4TestClass3 sayHello", Thread.currentThread().getStackTrace());
    }
}
