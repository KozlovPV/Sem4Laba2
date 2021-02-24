public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    Point3d myPoint = new Point3d();
    Point3d myOtherPoint1 = new Point3d(5, 3,8);
    Point3d myOtherPoint2 = new Point3d(5, 3,8);
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }
}
