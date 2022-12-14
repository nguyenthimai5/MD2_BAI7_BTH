package BTH2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------SHAPE--------------");
        Shape shape = new Shape("red", false);
        System.out.println(shape);


        System.out.println("----------CIRCLE--------------");
        Circle circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);


        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);


        System.out.println("---------SQUARE----------");
        Shape square = new Square(5.8, "yellow", true);
        System.out.println(square);


        System.out.println("--------------COMPARABLE---------------");
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }
    }
}
