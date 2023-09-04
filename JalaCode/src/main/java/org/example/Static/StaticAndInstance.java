package org.example.Static;

public class StaticAndInstance {

    static int  id;

    static String name;

    int age;

    String address;

    //static method
    public static void getValues(int id, String name,int age,String address){
        System.out.println("id: "+id+" "+"Name: "+name+" "+"Age: "+age+" "+"Address: "+address);
    }

    public void getMethod(int id){
        getMethod2(id);
        System.out.println("ID1: "+id);
    }

    public static void getMethod2(int id){
        System.out.println("ID2: "+id);
    }

    // non-static method
    public void getData(int id,String name,int age,String address){
        getMethod(id);
        System.out.println("id: "+id+" "+"Name: "+name+" "+"Age: "+age+" "+"Address: "+address);
    }

    public static void main(String[] args) {
        StaticAndInstance.getValues(101,"Srikanth",28,"Dilshukhnagar");
        StaticAndInstance st = new StaticAndInstance();
        st.getData(102,"Ramya",24,"BN reddy");
    }
}
