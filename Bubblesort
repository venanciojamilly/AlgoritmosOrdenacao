import java.util.Arrays;

public class teste {
    public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

    public static void sort(int[] array, int leftIndex, int rightIndex) {
        for (int i = leftIndex; i < rightIndex - 1; i++) {
            if (array[i]>array[i + 1]) {
                swap(array, i, i + 1);
                System.out.println(Arrays.toString(array));
            }
        }
       // System.out.println(Arrays.toString(array));
        if (rightIndex - 1 > 1) {
            sort(array, leftIndex, rightIndex - 1);
        }
     //   System.out.println(Arrays.toString(array));

    }
    public static void main (String[] args){
        int[] a = new int[4];
        a[0] = 61;
        a[1] = 9;
        a[2] = 0;
        a[3] = 6;
        sort(a,1,a.length);
    }
}
