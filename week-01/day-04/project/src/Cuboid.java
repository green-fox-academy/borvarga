public class Cuboid {
    public static void main(String[] args) {
        int heigth = 10;
        int width = 10;
        int depth = 10;

        int side1 = width * depth;
        int side2 = depth * heigth;
        int side3 = heigth * width;

        System.out.println("Volume is " + (heigth * width * depth));
        System.out.println("The surface area is " + (2 * (side1 + side2 + side3)));

    }
}
