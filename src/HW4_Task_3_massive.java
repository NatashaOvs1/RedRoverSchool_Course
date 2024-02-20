import java.util.Arrays;

public class HW4_Task_3_massive {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = array[i] + 15;
            }
        System.out.print(Arrays.toString(array));
    }
}

//    Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.
