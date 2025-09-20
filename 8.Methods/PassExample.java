class Person {
    String name;
    Person(String name) { this.name = name; }
}

public class PassExample {
    // Pass by value (primitive)
    static void modifyInt(int n) {
        n = n + 10;
    }

    // Pass by reference (object)
    static void modifyPerson(Person p) {
        p.name = "Alice";
    }

    public static void main(String[] args) {
        int num = 5;
        modifyInt(num);
        System.out.println("After modifyInt: " + num);

        Person person = new Person("Bob");
        modifyPerson(person);
        System.out.println("After modifyPerson: " + person.name);
    }
}
