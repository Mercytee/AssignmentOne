package com.assignment_one.assignment_one.Model;
//Creating Employee class
public class Employee {
    //creating properties of Employee class
    private int id;
    private String name, surname, address;
    private Department department;

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeSurname() {
        return surname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        surname = employeeSurname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

