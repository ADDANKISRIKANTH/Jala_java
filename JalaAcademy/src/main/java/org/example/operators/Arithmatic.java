package org.example.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public void getEqualAndNotEqual(int a,int b){
        if(a == b){
            System.out.println("a equals to b");
        }else if(a != b){
            System.out.println("a is not equal to b");
        }
    }

    public void getLogicalAndLogicalNotOperataor(int a,int b,int c){
        if(a > b && a > c){
            System.out.println("a is greater than b and c");
        }else if(b > a && b > c){
            System.out.println("b is greater than a and c");
        }else if(c > a && c > b){
            System.out.println("c is greater than a and b");
        }

        if(a == b && a == c){
            System.out.println(" a is equals to b and c");
        }else if(a != b && a == c){
            System.out.println("a is not equal to b and equal to c");
        }else if(!(a>b)){
            System.out.println("a is not greater than b ");
        }else if(!(a<b)){
            System.out.println("a is not less than b");
        }

    }

    public void getMessage(String str){
        int count=0;
        for(int i=0; i < 10; i++){
            count++;
            System.out.println(str);
        }
        System.out.println("count: "+count);
    }

    public void getTwentyNum(int n){
        int i=1;
        while(i<=n){
            System.out.println("Number: "+i);
            i++;
        }
    }

    public void getEvenOrOdd(int num){
        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("Odd number");
        }
    }

    public void getLargestNumber(int a,int b,int c){
        if(a >= b && a >= c){
            System.out.println("a is greater than b and c");
        }else if(b >= c && b >= a){
            System.out.println("b is greater than a and c");
        }else{
            System.out.println("c is greter than a and b");
        }
    }

    public void getEvenNumBet(int num){

        int count=1;
        List<Integer> n = new ArrayList<Integer>();
        while (count <= num){
            if(count %2==0){
                n.add(count);
                count++;
            }
            count++;
        }
        System.out.println(Collections.singletonList(n));
    }
}
