package solid.ocp.example1;

public class SelectionSort implements Sort{
    @Override
    public int[] sort(int[] arr) {
        System.out.printf("Selection Sort");
        System.out.printf("Selection Sort");
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update index of the lower element
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    return arr;
    }
}
