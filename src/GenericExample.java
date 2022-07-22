import java.util.ArrayList;
import java.util.List;

/*
  program to test generics in JAVA
 */

/**
 * an abstract to represent all the shapes
 */
abstract class Shape {
    abstract void draw();
}

/**
 * a Rectangle class to represent the triangle shape
 */
class Rectangle extends Shape {
    /**
     * method to draw rectangle
     */
    void draw() {
        System.out.println("drawing rectangle");
    }
}

/**
 * a class for circle shape which extends the Shape
 */
class Circle extends Shape {
    /**
     * method to draw Circle
     */
    void draw() {
        System.out.println("drawing circle");
    }
}

public class GenericExample {
    /**
     * creating a method that accepts only child class of Shape
     */
    private static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();//calling method of Shape class by child class instance
        }
    }

    /**
     * main method
     */
    public static void main(String[] args) {
/*
        list1 for Rectangle class
 */
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());

/*
        list2 for Circle class
 */
        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());

/*
        call the draw shape method on both lists
 */
        drawShapes(list1);
        drawShapes(list2);
    }
}
