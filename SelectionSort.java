import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortRecursivo {

    public static void selectionSort(int[] array, int index){
        if (array.length - 1 == index){
            return;
        }
        
        int indexMenor = index;
        for (int j = index+1; j < array.length; j++) {
            if (array[j]<array[indexMenor]){
                indexMenor = j;
            }
        }
        int temp = array[index];
        array[index] = array[indexMenor];
        array[indexMenor] = temp;
        selectionSort(array, index+1);


    }

}
