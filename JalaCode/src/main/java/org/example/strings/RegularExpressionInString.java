package org.example.strings;

public class RegularExpressionInString {

    public static void getStringMatch(String str1,String str2){
        boolean isMatch = str1.matches(str2);
        if(isMatch){
            System.out.println("The string matches the pattern");
        }else{
            System.out.println("The string not matches the pattern");
        }

    }
    public static void main(String[] args) {
        String str1 = "Hello, 12345";
        String str2 = "Hello, \\d+";
        getStringMatch(str1,str2);
    }
}
