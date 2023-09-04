package org.example.strings;

public class StringCreation {

    public static void createString(String str){
        System.out.println("String creation: "+str);
    }

    public static void getStringLiteral(String str){
        System.out.println("String literal: "+str);
    }

    public static void main(String[] args) {
        String str = "Hello Hyderabad";
        String str1 = new String("Hello Java");
        createString(str);
        getStringLiteral(str1);
    }
}
