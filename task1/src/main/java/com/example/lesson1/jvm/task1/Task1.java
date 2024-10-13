package com.example.lesson1.jvm.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

/*
* -Xms256m -Xmx256m. Количество созданных объектов на момент ошибки OutOfMemoryError = 5007985
* -Xms512m -Xmx512m. Количество созданных объектов на момент ошибки OutOfMemoryError = 9230100
* -Xms1g -Xmx1g. Количество созданных объектов на момент ошибки OutOfMemoryError = 20562663
*/

public class Task1 {
    private static final Logger LOGGER = Logger.getLogger(Task1.class.getName());

    public static void main(String[] args) {
        hugeNumberOfObjectGeneration();
    }

    public static void hugeNumberOfObjectGeneration() {
        Collection<TestClass> createdObjects = new ArrayList<>();
        try {
            while (true) {
                TestClass newObject = new TestClass();
                createdObjects.add(newObject);

                if (createdObjects.size() % 1_000_000 == 0) {
                    LOGGER.info("Created object count: " + createdObjects.size());
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {

                    }
                }
            }
        } catch (OutOfMemoryError e) {
            int createdObjectCount = createdObjects.size();
            createdObjects = null;

            LOGGER.info(
                    String.format(
                            "OutOfMemoryError thrown. Max JVM memory: %d mb. Created object count: %d",
                            Runtime.getRuntime().maxMemory() / 1048576,
                            createdObjectCount
                    )
            );

            throw e;
        }
    }
}
