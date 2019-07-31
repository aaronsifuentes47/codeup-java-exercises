import java.util.Scanner;

public class Person {
    private String firstName;
//    private String lastName;

    public Person(String name) {
        this.firstName = name;
    }
    public void setName(String name) {
        this.firstName = name;
    }
    public String getName() {
        return this.firstName;
    }

    public void sayHello() {
        System.out.printf("Hello, %s!\n", this.firstName);

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Person person = new Person();

//        person.sayHello();

    }
}