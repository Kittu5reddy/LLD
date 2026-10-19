package solid.ocp.example1;

import java.util.Arrays;

public class MergeSort  implements  Sort{

    // Merges two subarrays of a[]
    @Override
    public int[] sort(int a[]){
        System.out.printf("merge sort");
    Arrays.sort(a);
    return  a;
    }
}