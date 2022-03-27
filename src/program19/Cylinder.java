package program19;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);

     if (height< 0){
         height = 0;
     }
      height = height;
     }
        public double getHeight(){
        return height;
    }
    public double getVolume(){
        return super.getArea() * getHeight();
    }
}
