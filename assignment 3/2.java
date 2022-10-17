import java.util.Scanner;

class CountingSort {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        // Take a count array (array numbers are in range 0-20) to store the count of each number in array
        int count[] = new int[21];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
            count[arr[i]]++;
        }

        // Modify the count array such that each element at each index stores the sum of previous counts
        for (int i = 1; i < 21; i++) {
            count[i] += count[i - 1];
        }

        int k = size - 1;
        int sortedArray[] = new int[size];

        // Iterate array arr and copy the element i at its correct position count[arr[k]] - 1 according to count array in sortedArray 
        // After placing each element at its correct position, decrease its count by one.
        while (k >= 0) {
            sortedArray[count[arr[k]] - 1] = arr[k];
            count[arr[k]] -= 1;
            k -= 1;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(sortedArray[i] + " ");
        }

        s.close();
    }
}