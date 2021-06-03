package Smoothstack;
import java.util.Random;

/**
 * @author Brendon 
 * This program is for Java Basics 2 Assignment 3
 */

/* One object is created for each of the three classes Rectangle, Circle, and Triangle. The 
dimensions of the objects are then calculated and displayed. */
public class JB2_A3 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.calculateArea();
        rec.display();

        Circle circ = new Circle();
        circ.calculateArea();
        circ.display();

        Triangle tri = new Triangle();
        tri.calculateArea();
        tri.display();
    }
}

/* Interface with two methods to calculate area and display output. */
interface Shape {
    public void calculateArea();
    public void display();
}

/* Rectangle class that generates random integers between 1-20 for height/width and
then calculates the area. All values are then printed out with the display method. */
class Rectangle implements Shape {
    int width, height, area;
    Random rand = new Random();

    @Override
    public void calculateArea() {
        width = rand.nextInt(20) + 1;
        height = rand.nextInt(20) + 1;
        area = width * height;
    }

    @Override
    public void display() {
        System.out.println("Rectangle:");
        System.out.println("The width is " + width + " and the height is " + height);
        System.out.println("The area of the rectangle is " + area);
        System.out.println();
    }
}

/* Circle class that generates a random int between 1-20 for the radius and calculates the area
of the circle. Radius and area of the circle are then printed out. */
class Circle implements Shape {
    int radius;
    double area;
    Random rand = new Random();

    @Override
    public void calculateArea() {
        radius = rand.nextInt(20) + 1;
        //area = Math.round((Math.PI * Math.pow(radius, 2)));
        area = (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void display() {
        System.out.println("Circle:");
        System.out.println("The radius of the circle is " + radius);
        System.out.printf("The area of the circle is %.1f ", area);
        System.out.println();
        System.out.println();
    }
}

/* Triangle class that generates random values between 1-20 for the height/width and
calculates the area. All 3 values are then printed out with the display method. */
class Triangle implements Shape {
    int width, height;
    double area;
    Random rand = new Random();

    @Override
    public void calculateArea() {
        width = rand.nextInt(20) + 1;
        height = rand.nextInt(20) + 1;
        area = (0.5 * width * height);
    }

    @Override
    public void display() {
        System.out.println("Triangle:");
        System.out.println("The width is " + width + " and the height is " + height);
        System.out.printf("The area of the triangle is %.1f", area);
        System.out.println();
        System.out.println();
    }
}


