package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
//        do {
//            string.getString();
//        } while (string.yesNo());
//        string.getInt(5, 20);
//        string.getDouble(15.1, 15.9);

        do {
            input.getInt("Please enter a number: ");
            input.getDouble(5.1,19.9);
        } while (input.yesNo());
    }
}
