package util;

public class InputTest {

    public static void main(String[] args) {
        Input string = new Input();
//        do {
//            string.getString();
//        } while (string.yesNo());
//        string.getInt(5, 20);
//        string.getDouble(15.1, 15.9);

        do {
        System.out.println("enter a number: ");
            System.out.println("You entered: " + string.getInt(5,20));
        System.out.println("enter a decimal: ");
            System.out.println("You entered: " + string.getDouble(5.1,19.9));
        } while (string.yesNo());
    }
}
