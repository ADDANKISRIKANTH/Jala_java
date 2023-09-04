package org.example.strings;

public class SearchingString {

    public static void getSearchedString(String str){
        String st = String.valueOf(str.indexOf("java"));
        System.out.println(st);
    }

    public static void main(String[] args) {
        String s = "Hello java java";
        getSearchedString(s);
    }
}
