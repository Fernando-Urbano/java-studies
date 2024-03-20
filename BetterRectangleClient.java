public class BetterRectangleClient {
    public static void main(String[] args) {
        BetterRectangle r = new BetterRectangle(15, 20);
        System.out.println("Area: " + r.area());
        r.grow(10, 10);
        System.out.println("New area: " + r.area());
    }
}
