//A simple Example of the Non Primitive Data Types
public class Non_Primitive_Data_Types {
    public static void main(String[] args) {
        // Array
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // Object of a class
        Student student = new Student();
        student.roll = 1;
        student.name = "John";
        System.out.println(student.roll);
        System.out.println(student.name);

        // Wrapper Classes
        Integer age = 25;
        Double salary = 55000.50;
        System.out.println(age);
        System.out.println(salary);
    }
}

// A simple class for demonstration
class Student {
    int roll;
    String name;
}
