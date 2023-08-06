package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfArrays {
    public int getSumOfArrays(int []a){
        int len = a.length;
        int sum=0;
        for(int i=0; i < len; i++){
            sum += a[i];
        }
        return sum;
    }

    public void getAverage(int[] k){
        int n = k.length;
        int m = getSumOfArrays(k);
        int avg = m/n;
        System.out.println("Average: "+avg);
    }

    public int getIndexOfArrays(int [] arr,int index){
        if(arr == null){
            return -1;
        }
        int len = arr.length;
        int i=0;
        while(i <len){
            if(arr[i] == index){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }

    public void getSpecificArray(int []arr,int n1,int n2){

        boolean num1 = false;
        boolean num2 = false;

        for(int i : arr){
            if(i == n1){
                num1 = true;
            }else if(i == n2){
                num2 = true;
            }
        }
        if(num1){
            System.out.println("array contains num1: "+num1);
        }else if(num2){
            System.out.println("Arrays contain num2: "+num2);
        }else{
            System.out.println("Both arrays doesn't contains: num1 and num2");
        }
    }

    public List<Integer> removeArrayIndex(int [] arr, int ind){

        List<Integer> list = new ArrayList<>();
        int removedElem = 0;
        for(int i=0,k=0; i < arr.length; i++){
            if(i == ind){
                removedElem = ind;
                continue;
            }else{
                 list.add(arr[i]);
                 k++;
            }
        }
        System.out.println("removed: "+removedElem);
        return list;
    }

}
