package com.assignment_one.assignment_one.Model;


public class EmployeeMain {
    public static void main(String[] args) {
        Department informationTechnology = new Department();//instantiation
        Department humanResources = new Department();
        informationTechnology.setName("Information Technology");
        informationTechnology.setId(1);
        humanResources.setName("Human Resources");
        humanResources.setId(2);
        //creating object of Employee class
        Employee person1 = new Employee();
        Employee person2 = new Employee();
        //Setting values to the properties
    person1.setName("Mercy");
    person1.setEmployeeSurname("Moyo");
    person1.setAddress("123 Wessex");
    person1.setDepartment(informationTechnology);
    person1.setId(1);
    System.out.println(person1.getName()+ person1.getEmployeeSurname() + person1.getDepartment().getName());

    person2.setName("Thoko");
    person2.setEmployeeSurname("Dube");
    person2.setAddress("15 Stanley");
    person2.setDepartment(humanResources);
    person2.setId(2);
    System.out.println(person2.getName() +" " + person2.getEmployeeSurname() + person2.getDepartment().getName());



    }




}
