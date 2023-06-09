package com.assignment_one.assignment_one;

import com.assignment_one.assignment_one.Model.Addition;

public class Main {

    public static void main(String[] args) {
        Addition addition=new Addition();
        int result=addition.sum(-2,-2);

        System.out.println("addition = " + result);
    }
}
