package Arrays;

public class SecondLargestElement {

    public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("The array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }

        return secondLargest;
    }



    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int k = getSecondLargest(arr);
        System.out.println(k);
    }
}
