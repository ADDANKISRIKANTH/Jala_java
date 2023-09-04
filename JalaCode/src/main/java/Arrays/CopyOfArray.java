package Arrays;

public class CopyOfArray {

    public static void getCopyArray(int [] arr,int n){
        int [] copyArr = new int[n];

        for(int i=0; i<=arr.length-1; i++){
            copyArr[i] = arr[i];
        }

        for(int k: copyArr){
            System.out.println("K: "+k);
        }
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        getCopyArray(arr,arr.length);
    }
}
