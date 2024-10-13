package com.example.lesson1.jvm.task5;

public class Task5 {
    public static void main(String[] args) {
        while (true) {
            MyArrayList createdObjects = new MyArrayList();
            while (createdObjects.size() < 1_000_000) {
                createdObjects.add(new Task5TestClass());
            }
        }
    }
}
