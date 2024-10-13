package com.example.lesson1.jvm.task3;

public class Task3TestClass1 extends Task3TestClass {
    private Task3TestClass2 task3TestClass2;

    public Task3TestClass1(String id, String name) {
        super(id, name);
        this.task3TestClass2 = new Task3TestClass2(id, id + '.' + id, name + ".testClass2");
    }

    public void sayHello() {
        System.out.println("Hello from object with name " + getName());
        this.task3TestClass2.sayHello();
    }
}
