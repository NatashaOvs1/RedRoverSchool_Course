public class HW7_Task_1 {
    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.name = "Peter";
        pers1.age = 37;
        pers1.gender = "male";
        System.out.println(pers1.getName());

        Person pers2 = new Person();
        pers2.name = "Olia";
        pers2.age = 27;
        pers2.gender = "female";
        System.out.println(pers2.getName());

        Person pers3 = new Person();
        pers3.name = "Vania";
        pers3.age = 17;
        pers3.gender = "male";
        System.out.println(pers3.getName());

        Person pers4 = new Person();
        pers4.name = "Natasha";
        pers4.age = 22;
        pers4.gender = "";
        System.out.println(pers4.getName());

    }}

//        Person[] pers = {pers1, pers2, pers3, pers4};   //создадим типа массив
//for (int i = 0; i < pers.length; i++) {
//    Person currentPers = pers[i];      //создание переменной, которая указывает текущий элемент массива персон
//                                       //указывает индекс , который принимает i
////            if (currentPers.gender.equals("male")) {
//            pers[i].getname(sayname);
//    System.out.println(getName);
////            }
////            else {
//                System.out.println(getName);
//            }
//        }//    Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь

//        метод - getName, метод возвращает имя с префиксом “Mr. ” если пол
//        указан как мужской и префикс “Mrs. ” если женский.