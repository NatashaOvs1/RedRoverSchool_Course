public class HW7_Task_3 {
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

        Employee emp3 = new Employee();
        emp3.name = "Sveta";
        emp3.age = 29;
        emp3.gender = "female";
        emp3.salary = 5500;

        Employee[] employees = {emp1, emp2, emp3};
        System.out.println(Salary.getSum(employees));
            }
}
//    Необходимо создать класс Salary с единственным методом -
//        getSum(Employee[] employeeArray), метод должен возвращать
//        сумму зарплат всех сотрудников из массива переданного в
//        качестве аргумента вызова метода.