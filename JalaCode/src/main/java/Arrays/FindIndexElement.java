package Arrays;

public class FindIndexElement {

    public static int getIndex(int [] k, int key){
        for(int i=0; i < k.length-1; i++){
            if(k[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int getValue(int[] a,int  key){
        for (int i=0; i < a.length; i++){
            if(a[i] == key){
                return a[i];
            }
        }
        return -1;
    }

    public static void getRemove(int [] array,int key){
        for(int i=0; i < array.length; i++){
            if(array[i] == key){
                continue;
            }else{
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {


        int[] a = {10,20,30,40};
        int g = getIndex(a, 30);
        System.out.println(g);
        int val = getValue(a,20);
        System.out.println("Value: "+val);
        getRemove(a,30);
    }
}
