public class Triangle {
    double a;
    double b;
    double c;

    double trianglePerimeter() {
        return a + b + c;
    }

    Triangle(double aa, double ab, double ac) {
        a = aa;
        b = ab;
        c = ac;
    }
}
