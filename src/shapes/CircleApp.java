package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What is the radius of the circle?: ");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
    }
}
