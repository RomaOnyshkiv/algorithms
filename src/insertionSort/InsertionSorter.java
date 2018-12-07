package insertionSort;

import java.util.Arrays;
import java.util.stream.Stream;

class InsertionSorter {

    private int[] arr;

    InsertionSorter(int[] arr) {
        this.arr = arr;
    }

    void sort() {
        for (int i = 1; i < arr.length; i++) {
            int j = 0;
            while (j < i) {
                if (arr[j] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                j++;
            }
        }
    }

    void printArray() {
        Stream.of(arr).forEach(e -> System.out.print(" " + Arrays.toString(e)));
    }
}
