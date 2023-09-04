package org.example.strings;

import java.util.Arrays;

public class StringMatches {

    public static void getString(String str1,String str2){
        if(str1.equals(str2)){
            System.out.println("Matches");
        }else{
            System.out.println("Not matches");
        }
    }

    public static void getEqualIgnoreCase(String str1,String str2){
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("equalsIgnoreCase Matches");
        }else{
            System.out.println("equalsIgnoreCase Not matches");
        }

        boolean k = str1.startsWith(str2);
        boolean l = str1.endsWith(str2);
        System.out.println(k+" "+"l: "+l);
    }

    public static void getCompareTo(String str1,String str2){
        int n = str1.compareTo(str2);
        System.out.println(n);

        String split = Arrays.toString(str1.split(","));
        System.out.println("After split: "+split);

    }

    public static void main(String[] args) {
        String str1 = "Kello,";
        String str2 = "Hello";
        getString(str1,str2);
        getEqualIgnoreCase(str1,str2);
        getCompareTo(str1,str2);
    }
}
