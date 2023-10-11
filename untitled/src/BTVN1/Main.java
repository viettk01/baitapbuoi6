package BTVN1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chieu dai cua hinh chu nhat: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap chieu rong hinh chu nhat: ");
        int width = Integer.parseInt(scanner.nextLine());
        Rectangle rectangle = new Rectangle(length*width, (length + width) *2, length, width);

        System.out.println("chieu dai hinh chu nhat: "+rectangle.getLength());
        System.out.println("chieu rong hinh chu nhat: "+rectangle.getWidth());


        System.out.println("dien tich hinh chu nhat: "+rectangle.getAcreage());
        System.out.println("chu vi hinh chu nhat: "+rectangle.getPerimeter());

        System.out.println();



//        hình vuông
        System.out.println("nhap chieu dai canh cua hinh vuong: ");
        int side = Integer.parseInt(scanner.nextLine());
        Square square = new Square(side * side, side *4, side);

        System.out.println("chieu dai canh cua hinh vuong "+side);
        System.out.println("dien tich cua hinh vuong: "+square.getAcreage());
        System.out.println("chu vi cua hinh vuong: "+square.getPerimeter());


    }
}
