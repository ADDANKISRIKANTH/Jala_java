package org.example.strings;

public class SubstringExample {

    public static void getExtractString(String str){
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(6,str.length()));
    }

    public static void main(String[] args) {
        String originalString ="Hello java";
        getExtractString(originalString);
    }
}
