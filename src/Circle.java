public class Circle extends Shape implements Comparable, Cloneable {
    private double radius;

    protected Circle() {
        this(10);
    }
    protected Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Object o) {
//        if(this.calcArea() > ((Circle)o).calcArea())
//            return 1;
//        else if(this.calcArea() < ((Circle)o).calcArea())
//            return -1;
//        else
//            return 0;

        if(this.radius > ((Circle)o).radius)
            return 1;
        else if(this.radius < ((Circle)o).radius)
            return -1;
        else
            return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
