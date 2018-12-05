package qsort;

class QuickSorter {



    private int part(int[] arr, int low, int hight) {

        int pivot = arr[hight];
        int i = (low - 1);
        for (int j = low; j < hight; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i + 1];
        arr[i + 1] = arr[hight];
        arr[hight] = tmp;

        return i + 1;
    }


    void sort(int[] arr, int low, int hight) {

        if (low < hight) {
            int pi = part(arr, low, hight);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, hight);
        }
    }


    void printArray(int[] arr) {

        for (int e : arr) {
            System.out.print(" " + e);
        }

    }


}
