package poolarea;

public class Cuboid extends Rectangle {
    private double height;


    public Cuboid(double w, double l, double h) {
        super(w, l);
        if (h < 0) {
            h = 0;
        }
        this.height = h;

    }

    public double getHeight() {
        return height;

    }

    public double getVolume() {
        return super.getArea() * height;


    }
}