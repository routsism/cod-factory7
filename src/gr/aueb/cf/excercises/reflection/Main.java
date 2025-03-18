package gr.aueb.cf.excercises.reflection;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {

        Class<?> studentClass = Class.forName("gr.aueb.cf.excercises.reflection.Student");

        Constructor<?> defaultConstructor = studentClass.getConstructor();

        Object studentInstance = defaultConstructor.newInstance();


        Student student = (Student) studentInstance;
        student.setId(1);
        student.setFirstname("Michail");
        student.setLastname("Routsis");

        System.out.println(student.toString());
    }
}
