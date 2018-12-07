package insertionSort;

public class InsertionSort {

    public static void main(String... args) {

        int[] myArray = {3, 1, 9, 4, 2, 8, 6, 5};
        InsertionSorter sorter = new InsertionSorter();
        sorter.sort(myArray);
        sorter.printArray(myArray);

    }
}
