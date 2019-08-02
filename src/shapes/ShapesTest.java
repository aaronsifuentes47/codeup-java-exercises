package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println(box2.getArea());

        Measurable myShape;

        Measurable box = new Square(5);
        Measurable longBox = new Rectangle(5,10);

        myShape = box;

        System.out.println("area of square: " + myShape.getArea());
        System.out.println("area of rectangle: " + longBox.getArea());
        System.out.println("perimeter of square: "+ myShape.getPerimeter());
        System.out.println("perimeter of rectangle: "+ longBox.getPerimeter());
    }
}
