package org.example.Loops;

public class PrimeOrNot {

    public static String getPrime(int num){
        boolean prime = false;
        for(int i=2; i < num/2; i++){
            if(num%i== 0){
                prime = true;
            }
        }
        if(prime){
            return "Not prime";
        }else{
            return "Prime";
        }
    }

    public static void main(String[] args) {
        String str = getPrime(3);
        System.out.println(str);
    }
}
