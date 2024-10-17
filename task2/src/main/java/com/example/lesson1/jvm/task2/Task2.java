package com.example.lesson1.jvm.task2;

import java.util.logging.Logger;

public class Task2 { /* Описание класса, со всеми полями и методами, хранится в Method Area */
    private static final int SOME_CONSTANT = 1; /* Хранится в области Method Area */

    private int someVariable = 1; /* Значение переменной хранится в Heap, так как является частью объекта */

//    Переменная LOGGER размещается в Method Area, так как является static. Объект, прикрепленный к данной переменной располагается в Heap
    private static final Logger LOGGER = Logger.getLogger(Task2.class.getName());

    public static void main(String[] args) { /* Ссылочная переменная указываются на массив args сохранятся во фрейме метода main, в стеке, содержимое содержится в heap */
        int anotherPrimitiveVariable = 2; /* Значение располагается в фрейме стека, так как является примитивом */

        Task2 task2 = new Task2(); /* Ссылочная переменная размещается в фрейме стека. Содержимое объекта размещается в куче */
        LOGGER.info("Stack frame count on StackOverflowError: " + task2.recursiveInvoke(1));
    }

    private int recursiveInvoke(int tryIndex) {  /* Переменная сохраняется во фрейме метода в стеке */
        try {
            return recursiveInvoke(tryIndex + 1);
        } catch (StackOverflowError e) {
            return tryIndex;
        }
    }
}
