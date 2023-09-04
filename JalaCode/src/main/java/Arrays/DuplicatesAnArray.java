package Arrays;

public class DuplicatesAnArray {

    public static void getDupliArray(int [] arr,int n){
        int [] dup = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    dup[i] = arr[i];
                }
            }
        }
        for(int k: dup){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        int [] values = {10,10,20,30,40,50,50};
        getDupliArray(values,values.length);
    }
}
