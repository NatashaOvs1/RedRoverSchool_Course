public class HW5_Task_4 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum += array[i];
        }
        int average;
        average = sum / array.length;
        System.out.println("среднее арифметическое всех значений массива: " + average);
    }
}

//    Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
