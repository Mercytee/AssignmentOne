package com.assignmentTwo.AssignmentTwo;
public class Dog extends Mammal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("I AM BARKING");
    }
    public String toString(){
        String s = "Dog [name = "+ getName() + ", age =" + getAge() +"]";
        return s;
    }
}