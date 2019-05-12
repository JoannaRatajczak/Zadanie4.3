public class Main {
    public static void main(String[] args) {

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5.5);
        Triangle triangle = new Triangle(4.5, 8, 6.6);

        double sqrArea = square.squareArea();


        System.out.println("Square area: " + square.squareArea());
        System.out.println("Rectangle perimiter: " + rectangle.rectPerimeter());
        System.out.println("Circle area: " + circle.circleArea());
        System.out.println("Triangle perimiter: " + triangle.trianglePerimeter());


    }

}
