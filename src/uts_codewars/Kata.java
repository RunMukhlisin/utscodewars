package uts_codewars;

public class Kata {

    public static double getVolumeOfCuboid(double length,
            double width, double height) {
        double volume = length * width * height;
        return volume;
    }

    public static void main(String[] args) {
        double length = 5.5;
        double width = 3.2;
        double height = 4.7;

        double volume = getVolumeOfCuboid(length, width, height);
        System.out.println("The volume of the cuboid is: " + volume);
    }
}
