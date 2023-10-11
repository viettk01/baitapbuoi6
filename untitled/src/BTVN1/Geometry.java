package BTVN1;

public class Geometry {
    private int acreage; //diện tích
    private int perimeter; //chu vi


    public Geometry(int acreage, int perimeter) {
        this.acreage = acreage;
        this.perimeter = perimeter;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "acreage=" + acreage +
                ", perimeter=" + perimeter +
                '}';
    }
}
