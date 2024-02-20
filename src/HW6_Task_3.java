public class HW6_Task_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        System.out.println(s);

        for (int i = 0; i < s.length() - 3; i++) { //проходим по длине строки
            String subStr = s.substring(i, i + 3);
            if (subStr.equals("рит")) {
                System.out.print(i + " ");
            }
        }

    }}

//    Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.
