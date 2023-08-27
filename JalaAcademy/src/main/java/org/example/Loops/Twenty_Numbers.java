package org.example.Loops;

public class Twenty_Numbers {

    public static void getNumbersUptoTwenty(int num){
        int count = 1;
        while(count <= num){
            System.out.println(count);
            count++;
        }
    }

    public static void main(String[] args) {
        int n = 20;
        getNumbersUptoTwenty(n);
    }
}
