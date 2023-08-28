package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddArray {

    public static void getArray(int a){
        int [] arr = new int[a];
        int sum = 0;
        for(int i=1; i < a; i++){
            arr[i] = i;
            sum = sum+arr[i];
            System.out.println(sum);
        }
        double db = (double) sum /arr.length;
        System.out.println("Avg: "+db);
    }

    public static void getAverage(int a){
        getArray(a);
    }

    public static void main(String[] args) {
        getAverage(3);

    }
}
