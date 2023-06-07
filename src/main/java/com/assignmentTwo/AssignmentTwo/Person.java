package com.assignmentTwo.AssignmentTwo;

public class Person extends Mammal{
    public  Person(String name,  int age){
        super(name, age);
    }
    public void talk(){
        System.out.println("i am talking");
    }
    public String toString(){
        String a = "Person [name = " + getName() + ", age=" + getAge() + "]";
        return a;
    }
}
