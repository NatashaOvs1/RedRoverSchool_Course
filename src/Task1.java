public class Task1 {
    public static String Rubles(double z) {
        int i = (int) z;
        int y = (int) ((z - i) * 100);
        return (i + "руб " + y + "коп ");
    }
    public static void main(String[] args) {
            System.out.println(Rubles(10.50));
    }
}
//Написать метод, который принимает на вход
// десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.