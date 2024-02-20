public class HW6_Task1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        StringBuilder result = new StringBuilder(); //создать объект на основе существующей строки
        for (int i = 0; i < s.length(); i++) {      //проходим по длине строки
            if (s.charAt(i) == 'о') {        //Для извлечения символов по индексу в классе String определен метод char charAt(int index)
                result.append('о');          //Метод append() – обновляет значение объекта, который вызвал метод
            }
        }
        System.out.println(result.toString());
    }
}

    //        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//                Для указанной строки ответ будет “ооооо” (или в столбик)



