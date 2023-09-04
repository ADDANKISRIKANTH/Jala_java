package Arrays;

public class CommonValues {

    public static void getCommon(int [] arr1,int [] arr2){
        for(int i=0; i < arr1.length; i++){
            for(int j=0; j< arr2.length; j++){
                if(arr1[i]==arr2[j]){

                    System.out.println(arr1[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] val1 = {10,20,30,40,50};
        int [] val2 = {10,30,50,60,70};
        getCommon(val1,val2);
    }
}
