package util;

public class InputTest {

    public static void main(String[] args) {
        Input string = new Input();
        do {
            string.getString();
        } while (string.yesNo());
        string.getInt(5, 20);
        string.getDouble(15.1, 15.9);

    }
}
