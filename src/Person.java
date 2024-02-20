public class Person {
        String name;
        int age;
        String gender;
    String getName() {
        String prefix = "";
        if (gender == "male") {
            prefix = "Mr. " ;
        }
        else if (gender == "female") {
            prefix = "Mrs. ";
    }
        else {
            prefix = "name";
        }
        return prefix + name;
    }}





