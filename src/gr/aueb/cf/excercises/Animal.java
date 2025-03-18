package gr.aueb.cf.excercises;

import javax.xml.namespace.QName;

public class Animal {

    private String name;
    private int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("I am an animal");
    }

    public String toString() {
        return  ("(" + name + " ," + age + ")");
    }
}
