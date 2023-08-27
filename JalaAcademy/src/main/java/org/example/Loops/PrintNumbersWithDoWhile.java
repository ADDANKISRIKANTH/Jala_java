package org.example.Loops;

public class PrintNumbersWithDoWhile {

    public static void main(String[] args) {
        int n =10;
        int count =1;
        do{
            System.out.println("Num: "+count);
            count++;
        }while(count <= n);
    }
}
