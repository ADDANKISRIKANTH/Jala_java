package org.example.Loops;

public class Print10To100Numbers {

    public static void getNumbers(int num){
        int count = 10;

        while(count <= num){
            if(count%2==0){
                System.out.println("count: "+count);
                count++;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        int num = 100;
        getNumbers(num);
    }
}
