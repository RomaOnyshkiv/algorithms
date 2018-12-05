package qsort;

public class QuickSort {

    public static void main(String... args) {

        int[] array = {3, 1, 9, 4, 2, 8, 6, 5};

        QuickSorter sorter = new QuickSorter();
        sorter.sort(array, 0, array.length - 1);
        sorter.printArray(array);
    }
}
