package com.dubrov.adminterritoryunit;


public class Person {
    private String name;
    private String surname;
    private int age;
    private String position;

    public Person(String name, String surname, int age, String position) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    public String getPersonInfo() {
        return "\tname: " + name + "\n\tsurname: " + surname + "\n\tage: " + age + "\n\tposition: " + position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
