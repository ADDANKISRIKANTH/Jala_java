package Arrays;

public class FindEvenAndOddNum {

    public static void getEvenOddNum(int[] arr){

        for(int i=0; i <= arr.length-1; i++){
            if(arr[i] %2 ==0){
                System.out.println("Even number: "+arr[i]);
            }else{
                System.out.println("Odd number : "+arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        int [] k = {10,20,30,40,50,7};
        getEvenOddNum(k);
    }
}
