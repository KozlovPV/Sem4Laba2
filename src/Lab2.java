import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Point3d newPoint1 = new Point3d(getDouble(), getDouble(), getDouble());
        Point3d newPoint2 = new Point3d(getDouble(), getDouble(), getDouble());
        Point3d newPoint3 = new Point3d(getDouble(), getDouble(), getDouble());
        if(!(newPoint1.equals(newPoint2)||newPoint2.equals(newPoint3)||newPoint1.equals(newPoint3))){
            System.out.println(computeArea(newPoint1,newPoint2,newPoint3));
        }
        else{
            System.out.println("Вычисление фигуры невозможно!");
        }
    }

    public static double getDouble() {

        try {
            // Set up a reader tied to standard input.
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            // Read in a whole line of text.
            String s = br.readLine();

            // Conversion is more likely to fail, of course, if there's a typo.
            try {
                double d = Double.parseDouble(s);

                //Return the inputted double.
                return d;
            } catch (NumberFormatException e) {
                // Bail with a 0.  (Simple solution for now.)
                return 0.0;
            }
        } catch (IOException e) {
            // This should never happen with the keyboard, but we'll
            // conform to the other exception case and return 0 here,
            // too.
            return 0.0;
        }
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = point1.distanceTo(point2);
        double b = point2.distanceTo(point3);
        double c = point1.distanceTo(point3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
