package com.example.lesson1.jvm.task3;

public class PrintStackUtil {
    public static void printStackTrace(String methodName, StackTraceElement[] stack) {
        System.out.println("--------------start - method: " + methodName + "----------------");
        System.out.println("Method: " + methodName);
        for (int i = 1 /* Для исключения из списка метода формирования списка вызовов */; i < stack.length; i++) {
            System.out.println(stack[i]);
        }
        System.out.println("---------------finish - method: " + methodName + "---------------");
    }
}
