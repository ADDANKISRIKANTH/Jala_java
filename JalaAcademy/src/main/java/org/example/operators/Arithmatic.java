package org.example.operators;

public class Arithmatic {

    public void getAddition(int a, int b){
        int sum = a+b;
        System.out.println("sum: "+sum);
    }

    public void getSubStraction(int m, int n){
        int sub = m-n;
        System.out.println("sub: "+sub);
    }

    public void getMultiplication(int k,int l){
        int mul = k*l;
        System.out.println("mul: "+mul);
    }

    public void getDivision(int j,int h){
        double d = j/h;
        System.out.println("division: "+d);
    }

    public void getPreIncrement(int a,int b){
        int d;
        d = b+(++a);
        System.out.println("Values after Pre-Increment a,b : " + a + "," + d);
    }

    public void getPostIncrement(int m,int n){
        int k;
        k = n+(m++);
        System.out.println("Values after Post-Increment m,n : " + m + "," + n);
    }
}
