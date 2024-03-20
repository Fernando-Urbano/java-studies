public class RectangleClient {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
        System.out.println(r.sizes());
        System.out.println("Area: " + r.getArea());

        r.width += 50;
        r.height = 5;

        System.out.println(r.sizes());
        System.out.println("Area: " + r.getArea());
    }
}
