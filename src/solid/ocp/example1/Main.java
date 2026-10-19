package solid.ocp.example1;

public class Main {
    public static void main(String[] args) {
        int arr[]={2,-1,34,21,4,6};
        Sort s=new InsertionSort();
        s.sort(arr);
        s=new MergeSort();
        s.sort(arr);
        s=new InsertionSort();
        s.sort(arr);

    }
}
