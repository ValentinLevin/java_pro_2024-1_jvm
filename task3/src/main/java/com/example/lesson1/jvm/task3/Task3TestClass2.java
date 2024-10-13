package com.example.lesson1.jvm.task3;

public class Task3TestClass2 extends Task3TestClass{
    private String parentId;
    private Task3TestClass3 task3TestClass3;

    public Task3TestClass2(String parentId, String id, String name) {
        super(id, name);
        this.parentId = parentId;

        this.task3TestClass3 = new Task3TestClass3(id, id + "." + id, name + ".testClass3");
    }

    public void sayHello() {
        System.out.println("Hello from object with name " + getName());
        PrintStackUtil.printStackTrace("Task4TestClass2 sayHello", Thread.currentThread().getStackTrace());
        task3TestClass3.sayHello();
    }
}
