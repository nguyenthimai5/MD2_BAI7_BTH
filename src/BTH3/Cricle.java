package BTH3;

public class Cricle extends Shape {
    private double radius=1.0;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return  "A Circle with radius ="
                +getRadius()
                +" , Which is a subclass of "
                +super.toString();
    }
}
