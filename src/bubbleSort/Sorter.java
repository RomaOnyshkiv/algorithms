package bubbleSort;

class Sorter {

    private int[] array;

    Sorter(int[] array) {
        this.array = array;
    }

    void sort() {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }

}
