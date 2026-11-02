public class Main {
    public static void main(String[] args) {
        final double PI = 3.14;
        int radius = 7;

        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
    }
}
