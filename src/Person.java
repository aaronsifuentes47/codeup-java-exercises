import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;

//    public Person() {
//        firstName;
//    }
    public Person(String name) {
        this.firstName = name;
    }
    public void setName(String name) {
        firstName = name;
    }
    public String getName() {
        return firstName;
    }

    public void sayHello() {
        System.out.println("Hello, " + getName() + "!");

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Person person = new Person();

//        person.sayHello();
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
    }
}
