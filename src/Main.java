public class Main {
    public static void main(String[] args) {

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5.5);
        Triangle triangle = new Triangle(4.5, 8, 6.6);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Square area: "+shapeCalculator.squareArea(square));
        System.out.println("Rectangle perimiter: "+shapeCalculator.rectPerimeter(rectangle));
        System.out.println("Circle area: "+shapeCalculator.circleArea(circle));
        System.out.println("Triangle perimiter: "+shapeCalculator.trianglePerimeter(triangle));


    }

}
