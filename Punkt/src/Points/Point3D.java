package Points;

class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        super.getX();
        super.getY();
        super.setX(x);
        super.setY(y);
        this.z=z;

    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void showPoint3D() {
        super.showPoint2D();
        System.out.println("z: " + z);
    }
}
