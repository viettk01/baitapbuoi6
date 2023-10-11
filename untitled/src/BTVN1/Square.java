package BTVN1;

public class Square extends Geometry{
    private int side;

    public Square(int acreage, int perimeter, int side) {
        super(acreage, perimeter);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "dien tich bang: " +side * side+
                "chu vi bang: " +side * 4 +
                "side=" + side +
                '}';
    }
}
