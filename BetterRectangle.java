public class BetterRectangle {
    int width;
    int height;

    public BetterRectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public void grow(int dw, int dh) {
        this.width += dw;
        this.height += dh;
    }

    public int area() {
        return this.width * this.height;
    }

}

