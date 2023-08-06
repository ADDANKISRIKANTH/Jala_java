package org.example.programs;

public class ArmstrongNumber {

    public void getArmStrongNumber(int m){
        int result=0;
        int real;
        int n;
        real = m;
        while (real != 0){
            n = real%10;
            result += Math.pow(n,3);
            real = real/10;
        }
        if(result == m){
            System.out.println("Arm strong number");
        }else{
            System.out.println("Not armstrong number");
        }
    }

    public String isPrime(int m){
        boolean flag = false;
        for(int count=2; count <m/2; count++){
            if(m%count==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            return "prime";
        }else{
            return "Not prime";
        }
    }

    public void getArmStrong(int k){
        int rev,on,result=0;

        on=k;
        while(k!=0){
            rev = k%10;
            result = (result*10)+rev;
            k = k/10;
        }
        if(result == on){
            System.out.println("ArmStrong number");
        }else{
            System.out.println("Not arm strong number");
        }
    }
}
