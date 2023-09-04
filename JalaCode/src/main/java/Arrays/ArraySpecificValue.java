package Arrays;

public class ArraySpecificValue {

    public static int getValues(int [] arr,int n,int key){
        for(int i=0; i< n-1; i++){
            if(arr[i] == key){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int k = getValues(a,5,3);
        System.out.println("K: "+k);
    }
}
