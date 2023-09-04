package org.example.Loops;

public class MaleVsFemale {

    public static void getName(char gender) {

        switch(gender){

            case 'M':
            case 'm':
                System.out.println("Gender male: "+gender);
                break;
            case 'F':
            case 'f':
                System.out.println("Gender female: "+gender);
                break;
            default:
                System.out.println("Other gender");
        }
    }

    public static void main(String[] args) {
        getName('Z');
    }
}
