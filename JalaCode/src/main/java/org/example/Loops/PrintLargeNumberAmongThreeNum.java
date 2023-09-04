package org.example.Loops;

public class PrintLargeNumberAmongThreeNum {

    public static void getMaxNumber(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("A is greater than b and c");
        }else if(b > a && b > c){
            System.out.println("B is greater than a and c");
        }else{
            System.out.println("C is greater than a and b");
        }
    }

    public static void main(String[] args) {
        int a = 10,b=20,c=30;
        getMaxNumber(a,b,c);
    }
}
