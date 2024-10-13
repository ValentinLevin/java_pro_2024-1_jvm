package com.example.lesson1.jvm.task3;

public class Task3 {
    public static void main(String[] args) {
        PrintStackUtil.printStackTrace("main", Thread.currentThread().getStackTrace());
        Task3 task = new Task3();
        task.doSomething();
    }

    void doSomething() {
        PrintStackUtil.printStackTrace("doSomething", Thread.currentThread().getStackTrace());

        Task3TestClass1 testClass1 = new Task3TestClass1("1", "testClass1");
        testClass1.sayHello();
    }
}
