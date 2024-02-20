public class HW6_Task_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {      //проходим по длине строки
            if (s.charAt(i) == 'е') {        //Для извлечения символов по индексу в классе String определен метод char charAt(int index)
                count++;
        }
    }
     System.out.println("String contains letter 'e':" + count);
}}

//    Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.
