import java.util.Arrays;
import java.util.Scanner;

class insertionsort {

    public static void insertionSort(String[] arr, int i, int n) {
        String value = arr[i];
        int j = i;
        while (j > 0 && Integer.parseInt(arr[j - 1]) > Integer.parseInt(value)) {
            arr[j] = arr[j - 1];
            j--;

        }

        arr[j] = value;
        System.out.println(Arrays.toString(arr));
        if (i + 1 <= n) {
            insertionSort(arr, i + 1, n);
        }
    }


}
