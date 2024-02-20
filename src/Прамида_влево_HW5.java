    public class Прамида_влево_HW5 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    }



