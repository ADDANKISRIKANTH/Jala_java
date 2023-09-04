package org.example.strings;

public class FindLengthOfString {

    public static void getLength(String str){
        int len = str.length();
        System.out.println("String: "+str+" "+"String length: "+len);
    }

    public static void main(String[] args) {
        String str = "Hello java";
        getLength(str);
    }
}
