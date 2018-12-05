package selectionSort;

class Sorter {

    int [] array;

    Sorter(int[] array) {
        this.array = array;
    }


    void sort() {

        for (int min = 0; min < array.length -1; min++) {
            int least = min;
            for (int i = min + 1; i < array.length; i++) {
                if (array[i] < array[least]) {
                    least = i;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
        for (int e: array) {
            System.out.print(" " + e);
        }
    }


}
