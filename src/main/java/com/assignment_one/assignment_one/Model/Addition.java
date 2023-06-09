package com.assignment_one.assignment_one.Model;
 public   class Addition implements MathsInterface {



    @Override
    public int sum(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;

    }

    @Override
    public int sum(int n1, int n2) throws IllegalArgumentException{
        if (isNegative(n1,n2)){
            throw new IllegalArgumentException("Input is negative");
        }
        return n1 + n2;
    }

    private boolean isNegative(int number,int number2){
        return number<0||number2<0;
    }
}

