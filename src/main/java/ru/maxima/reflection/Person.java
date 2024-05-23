package ru.maxima.reflection;

public class Person {
    //Поджи сущность У нас есть класс, у него есть имя, у него есть имя пакета, поля, методы
    //Class{
    // String name
    // String packageName
    // List<Attribute> attributes
    // List <Method> methods
    //}

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
