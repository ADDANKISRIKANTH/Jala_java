package org.example.Loops;

public class Palindrome {

    public static void getNum(String num){
         String str = "";
        for(int i=num.length()-1; i>=0; i--){
             char stri = num.charAt(i);
             str += String.valueOf(stri);
        }
        System.out.println(str);
        if(str.equalsIgnoreCase(num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        getNum("ramar");
    }
}
