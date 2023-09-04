package Arrays;

public class ReverseArray {

    public static void getValues(int [] arr,int n){
        int [] arra = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            arra[i]=arr[i];
            System.out.println(arra[i]);
        }

    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        getValues(arr,arr.length);
    }
}
