// wp to find larget value amoung n numbers
// wp t create constructrof class  pramaetrerized
// wp to class shape and override area metchod to cslculate rea of rextange ,xquare ,and corcle
// wp to implement the comcept of method overloading and constructor overloading

class abc {
    abc(int a) {
        System.out.println("constructer created");
        System.out.println(a);
    }

    abc(int a, int b) {
        System.out.println("constructer created");
        System.out.println(a);
        System.out.println(b);
    }

    abc() {
        System.out.println("constructer created");

    }
}

abstract class shape {
    abstract double area();
}

class Rectangle extends shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Square extends shape {
    double side;

    Square(double side) {

        this.side = side;
    }

    double area() {
        return side * side;
    }
}

class Circle extends shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Constructor {
    public static void main(String[] args) {
        abc a = new abc(2);
        abc b = new abc(2, 5);
        abc c = new abc();
        shape rectangle = new Rectangle(12, 10);
        shape square = new Square(12);
        shape circle = new Circle(10);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());
    }
}
