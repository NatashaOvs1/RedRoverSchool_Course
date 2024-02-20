public class HW5_Task_2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести максимальное значение массива.
