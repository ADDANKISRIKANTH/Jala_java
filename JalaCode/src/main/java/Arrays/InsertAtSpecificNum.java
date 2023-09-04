package Arrays;

public class InsertAtSpecificNum {

    public static void getElement(int[] arr,int val, int pos){

        for(int i=0; i < arr.length; i++){
            if(i == pos){
                arr[i] = val;
            }
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int [] m = {10,20,30,40,50};
        getElement(m,35,3);
    }
}
