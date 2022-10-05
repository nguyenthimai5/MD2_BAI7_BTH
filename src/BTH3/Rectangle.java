package BTH3;

public class Rectangle extends Shape{
    private  double width=1.0;
    private double lenght=1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return  width*this.lenght;
    }
    public  double getPrimeter(){
        return  2*(width+this.lenght);
    }
    public  String toString(){
        return  "A Rectangle with width = "
                +getWidth()
                +" and lenght = "
                +getLenght()
                +" , Which is a subclass of "
                +super.toString();
    }
}
