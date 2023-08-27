package org.example.Loops;

public class EqualAndNonEqual {

    public static void getEqualNotEqual(int a,int b){
        if(a==b){
            System.out.println("a is equal to b");
        }else if(a != b){
            System.out.println("a is not equal to b");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        getEqualNotEqual(a,b);
    }
}
