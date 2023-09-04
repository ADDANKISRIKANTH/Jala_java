package org.example.basics;

public class create {

    int a = 22;

    public void getMethod(){
        String s = "Hello java";
        System.out.println(s);
    }

    public String getName(){
        return "Srikanth";
    }

    public void getComment(){
        System.out.println("//This is single line comment");
        System.out.println("/*This is a Multi-line comment */");
        System.out.println("/*This is a Multi-line comment */");
    }

    public void getDataTypes(){
        int i = 11;
        float f = 11.2f;
        double d = 1111.11111;
        char c = 'd';
        boolean b = true;
        System.out.println("integer i:"+i+" float f: "+f+" double d:"+d+" char c: "+c+" boolean b:"+b);
    }

    public void getScopeOfVariables(){
        int a = 10;
        System.out.println("a: local variablle: "+a);
    }
}
