package Arrays;

public class ArrayMaxAndMin {

    public static void getMinArray(int [] arr,int n){
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<=n-1;i++){
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max+" "+"Min: "+min);
        int differ = max-min;
        System.out.println("Difference between max and min: "+differ);
    }


    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        getMinArray(arr,arr.length);
    }
}
