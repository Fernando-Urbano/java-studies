public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public String sizes() {
        return "Height: " + this.height + ", Width: " + this.width;
    }
}
