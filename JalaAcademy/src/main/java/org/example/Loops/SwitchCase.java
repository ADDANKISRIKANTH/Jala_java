package org.example.Loops;

public class SwitchCase {

    public static void getNum(int num){
        switch(num%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }

    public static void main(String[] args) {
        getNum(20);
    }
}
