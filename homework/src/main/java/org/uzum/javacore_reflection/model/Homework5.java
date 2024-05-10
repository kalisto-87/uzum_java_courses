package org.uzum.javacore_reflection.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Homework5 {

    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Class<Cat> clazz = Cat.class;

        System.out.println("Class Name:" + clazz.getSimpleName());
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("-- constructors:");
        System.out.println(Arrays.toString(constructors));

        Constructor<Cat> constructor = clazz.getConstructor(int.class);
        Cat newCat = constructor.newInstance(10);
        System.out.println("name:" + newCat.getName());

        System.out.println("--- fields:");
        Field[] fields = clazz.getSuperclass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        Field field = clazz.getSuperclass().getDeclaredField("feet");
        field.setAccessible(true);
        field.set(newCat, 10);

        field = clazz.getSuperclass().getDeclaredField("age");
        field.setAccessible(true);
        field.set(newCat, 150);

        field = clazz.getSuperclass().getDeclaredField("name");
        field.set(newCat, "Mursik");

        System.out.println(String.format("Hello, I am a cat %s. I am %s years old, I have %s paws. ", newCat.getName(), newCat.getAge(), newCat.getFeet()));


    }
}
