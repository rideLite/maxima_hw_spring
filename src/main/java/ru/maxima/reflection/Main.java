package ru.maxima.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    //Рефлексия - Общий класс, внутри которого класс Пёрсон, внутри которого сущность classPerson
    public static void main(String[] args) {
        Class classPerson = Person.class;
        
        Person sergey = new Person("Sergey", 25);
        Class<? extends Person> aClass = sergey.getClass();
        try {
            Class bClass = Class.forName("ru.maxima.reflection.Person");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String name = classPerson.getName();
        Package aPackage = classPerson.getPackage();
        Field[] fields = classPerson.getFields();
        Method[] methods = classPerson.getMethods();

//        for(Method m : methods){
//            System.out.println(m);
//        }

        // с помощью рефлексии мы можем даже достучаться до полей, которые СКРЫТЫ ИНКАПСУЛЯЦИЕЙ
        Field[] declaredFields = classPerson.getDeclaredFields();
        for(Field m : declaredFields){
            System.out.println(m);
        }

    }
}
