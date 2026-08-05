import java.util.Scanner;

public class LinearSearchDetailed {
    // Function to perform linear search
    public static int linearSearch(int arr[], int key) {
        // Loop through each element
        for (int i = 0; i < arr.length; i++) {
            // Compare current element with key
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Input key to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Step 4: Call linear search function
        int result = linearSearch(arr, key);

        // Step 5: Print result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
