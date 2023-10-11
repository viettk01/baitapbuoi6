package BTVN1;

public class Rectangle extends Geometry{
    private int length;
    private int width;

    public Rectangle(int acreage, int perimeter, int length, int width) {
        super(acreage, perimeter);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Dien tich la: " + length * width +
                "Chu vi la: " + (length + width) *2 +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}


