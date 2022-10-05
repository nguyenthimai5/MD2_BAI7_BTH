package BTH3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("************SHAPE**************");
        Shape shape = new Shape("blue", true);
        System.out.println(shape);


        System.out.println("***********CIRCLE**********");
        Cricle cricle = new Cricle("red", false, 2.4);
        System.out.println(cricle);


        System.out.println("**************RECTANGLE*************");
        Rectangle rectangle = new Rectangle("pink", true, 4.5, 6.7);
        System.out.println(rectangle);

        System.out.println("*************SQUARE*************");
        Square square = new Square("yellow", false, 3);
        System.out.println(square);
       Cricle[] cricles=new Cricle[3];
       cricles[0]=new Cricle("blue",true,4.5);
       cricles[1]=new Cricle("white",false,3.5);
       cricles[2]=new Cricle("pink",true,3.6);

        Arrays.sort(cricles, new Comparator<Cricle>() {
            @Override
            public int compare(Cricle o1, Cricle o2) {
                return  (int)o1.getRadius()-(int) o2.getRadius();
            }
        });
        for (int i = 0; i < cricles.length; i++) {
                System.out.printf("COLOR:%s -- Filled :%b--Radius: %f\n",cricles[i].getColor(),cricles[i].isFilled(),cricles[i].getRadius());


        }
    }
}
