package com.assignment_one.assignment_one.Model;

public class AddNum implements Adding_One {

    public static void main(String[]args){
        int n1= 5, n2= 6;
        int sum = n1 + n2;
        System.out.println(sum);
    }

        @Override
        public int sum(int n1, int n2) {
            return 0;
        }
    }



