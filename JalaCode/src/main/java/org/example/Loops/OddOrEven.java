package org.example.Loops;

public class OddOrEven {

    public static void getEvenOrOdd(int a){
        if(a%2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("Not even number");
        }
    }

    public static void main(String[] args) {
        int a = 9;
        getEvenOrOdd(a);
    }
}
