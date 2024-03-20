public class PrivateSquare {
    private int size;

    public PrivateSquare(int size) {
        this.setSize(size);
    }

    public int getArea() {
        return size * size;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int newSize) {
        if (newSize < 0) {
            throw new IllegalArgumentException("Size cannot be negative");
        } else if (newSize == 0) {
            throw new IllegalArgumentException("Size cannot be zero");
        }
        this.size = newSize;
    }
}
