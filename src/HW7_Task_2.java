public class HW7_Task_2 {
    public static void main(String[] args) {
Employee emp1 = new Employee();
emp1.name = "Peter";
emp1.age = 34;
emp1.gender = "male";
emp1.salary = 3500;

Employee emp2 = new Employee();
emp2.name = "Pavel";
emp2.age = 24;
emp2.gender = "male";
emp2.salary = 1500;

        System.out.println(emp1.isSameName(emp2));

        Employee emp3 = new Employee();
        emp3.name = "Pavel";
        emp3.age = 29;
        emp3.gender = "male";
        emp3.salary = 5500;

        System.out.println(emp1.isSameName(emp2));
    }
}



//    Необходимо создать класс Employee с полями как у Person
//    (из предыдущего задания) и поле зарплата.
//    Класс должен иметь метод isSameName(Employee employee)
//    который возвращает true, если у сотрудника у которого был вызван
//    метод и сотрудника который был передан как параметр, одинаковое имя.
//        “проверь, не тезка ли тебе вот этот чувак”
