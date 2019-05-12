public class Main {
    public static void main(String[] args) {

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5.5);
        Triangle triangle = new Triangle(4.5, 8, 6.6);

        double sqrArea=square.squareArea();
        double restPerimiter=rectangle.rectPerimeter();
        double circleArea=circle.circleArea();
        double trianglePerimiter=triangle.trianglePerimeter();

        System.out.println("Square area: " + sqrArea);
        System.out.println("Rectangle perimiter: " + restPerimiter);
        System.out.println("Circle area: " + circleArea);
        System.out.println("Triangle perimiter: " + trianglePerimiter);


    }

}
