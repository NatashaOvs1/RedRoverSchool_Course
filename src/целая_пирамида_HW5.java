public class целая_пирамида_HW5 {
    public static void main(String[] args) {
           // Пробелы для выравнивания пирамиды
            for (int i = 10; i >= 0; i--) {
                 for (int j = 10; j > i; j--) {
                     System.out.print("  ");
                 }
            // Отображение чисел в убывающем порядке
            for (int j = i - 1; j > 0; j--){
            System.out.print(j + " ");
            }
        // Отображение чисел в возрастающем порядке
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
   }}
