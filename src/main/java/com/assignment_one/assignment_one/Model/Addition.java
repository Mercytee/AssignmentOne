package com.assignment_one.assignment_one.Model;
 public   class Addition implements MathsInterface {



    @Override
    public int sum(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;

    }

    @Override
    public int sum(int n1, int n2) {
        return n1+n2;
    }
}

