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

        Square box = new Square(5);
        Rectangle longBox = new Rectangle(5,10);

        myShape = box;

        System.out.println(myShape);
        System.out.println(longBox);
    }
}
