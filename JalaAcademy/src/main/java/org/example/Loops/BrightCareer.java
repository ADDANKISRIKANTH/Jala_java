package org.example.Loops;

public class BrightCareer {

    public static void getStringName(String str,int n){
        for(int i=0; i < n; i++){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String str = "Bright IT Career";
        int len = 10;
        getStringName(str,len);
    }
}
