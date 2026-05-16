import java.util.*;

class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store smallest possible value initially
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse every element in the array
        for (int i = 0; i < n; i++) {

            // If current element is greater than largest
            if (arr[i] > largest) {

                // Old largest becomes second largest
                secondLargest = largest;

                // Current element becomes largest
                largest = arr[i];

            } 
            // If current element is smaller than largest
            // but greater than second largest
            else if (arr[i] > secondLargest && arr[i] != largest) {

                // Current element becomes second largest
                secondLargest = arr[i];
            }
        }

        // If secondLargest is not updated
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(secondLargest);
        }
    }
}
