public class SquareClient {
    public static void main(String[] args) {
        Square s = new Square(15, "cm");
        System.out.println("Area: " + s.getArea());
        System.out.println("Sizes: " + s.sizes());
    }
}
