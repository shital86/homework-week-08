package program19;

public class Circle {
   private double radius;

    public  Circle(double r) {
        if (r < 0 ) {
            r = 0;

        } else
            radius = r;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
         return (radius * radius * Math.PI);


    }
}