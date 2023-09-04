package Arrays;

public class RemoveSpecificArray {


    public static void getSpecificVal(int [] arr,int n,int key){
        for(int i=0; i <= n-1; i++){
            if(arr[i] == key){
                continue;
            }else{
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int k[] = {10,20,30,40,50};
        getSpecificVal(k,5,30);
    }
}
