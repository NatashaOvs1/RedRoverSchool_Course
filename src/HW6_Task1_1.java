public class HW6_Task1_1 {
    public static int getSum(int i, int b) {
        return i + b;
    }
    public static int getDiff(int c, int d) {
        return c -d;
    }
    public static int getMult(int e, int f) {
        return e * f;
    }
    public static int getDivide(int k, int l) {
        return k / l;
    }
    public static void main(String[] args) {
        System.out.println(getSum(2, 16));     // сложение 2х чисел
        System.out.println(getDiff(28, 16));  // вычитание 2х чисел
        System.out.println(getMult(28, 16));     // умножение 2х чисел
        System.out.println(getDivide(30, 5));         // деление 2х чисел
    }
}
