public class HW5_Task_5 {
 public static void main(String[] args) {
      int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               sum = sum + array[i][j];
           }
       }
        System.out.println("сумму всех значений массива:" + sum);
   }
}
//    Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
