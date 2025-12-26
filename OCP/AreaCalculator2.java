package OCP;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;

    }
}

public class AreaCalculator2 {
    public double calculateArea(Shape shape) {
        return shapecalculateArea();
    }

    private double shapecalculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shapecalculateArea'");
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;

    }

    public double getRadius() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRadius'");
    }
}
