public class Task_for_call_3_1 {

    public static void Numbers(int num1, int num2) {
        for (int i = num1*10; i <= num2*10; i++) {
            System.out.println(i*1.0/10);
        }
    }
    public static void main(String[] args) {
           Numbers(12, 13);
        }

    }
// Написать метод, который распечатывает
// последовательность чисел в промежутке [12, 13] с шагом 0.1
