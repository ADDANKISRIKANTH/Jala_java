package Arrays;

import java.util.*;

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

    public void setTheValueAtPosition(int n,int arr[],int val,int pos){
        // 5,{1,2,3,4,5},50,5
        int [] newArray = new int[n+1];
        for(int i=0; i < n+1; i++){
            if(i < pos-1){
                newArray[i] = arr[i];
            }else if(i == pos-1){
                newArray[i] = val;
            }else{
                newArray[i] = arr[i-1];
            }
        }
        for(int i: newArray){
            System.out.println(i);
        }
    }

    public void getMaxAndMinVal(int [] arr){
        // 10,20,30,40,50
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }else if(min <= arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max: "+max+" "+"min: "+min);
    }

    public void getReverseArray(int [] arr){
        List<Integer> k = new ArrayList<>();
        for(int i = arr.length-1; i >= 0; i--){
            k.add(arr[i]);
        }
        System.out.println(k.toString());
    }

    public void getDuplicateArrayValues(int [] arr){
        for(int i=0; i < arr.length-1;i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] == arr[j] && (i != j)){
                    System.out.println("Duplicate array: "+arr[j]+" ");
                }
            }
        }
    }

    public void findCommonValues(String [] str1,String [] str2){
        Set<String> set = new HashSet<>();

        for(int i=0; i < str1.length; i++){
            for(int j=0; j < str2.length; j++){
                if(str1[i] == str2[j]){
                    set.add(str1[i]);
                    break;
                }
            }
        }
        for(String i: set){
            System.out.println(Collections.singletonList(i));
        }
    }

}
