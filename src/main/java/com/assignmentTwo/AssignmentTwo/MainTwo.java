package com.assignmentTwo.AssignmentTwo;

import java.util.Arrays;

public class MainTwo {
    public static void main(String[] args) {
        Person person = new Person("Mercy", 25);
        Dog dog = new Dog("Bluey", 3);

        person.talk();
        dog.talk();

        System.out.println(person.getName());
        System.out.println(dog.getName());
    }
}
