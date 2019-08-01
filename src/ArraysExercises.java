import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    private static Person[] addPerson(Person[] group, Person newMember) {
        Person[] newGroup = Arrays.copyOf(group,group.length+1);
        newGroup[newGroup.length-1] = newMember;
        return newGroup;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person person1 = new Person("John");
        Person person2 = new Person("Gabe");
        Person person3 = new Person("Mike");

        String[] peeple = new String[3];
        peeple[0] = person1.getName();
        peeple[1] = person2.getName();
        peeple[2] = person3.getName();

        System.out.println(Arrays.toString(peeple));

        Person[] people = {new Person("Michael"), new Person("Gabriel"), new Person("John")};

        for (Person someone : people) {
            System.out.println(someone);

        }
    }
}
