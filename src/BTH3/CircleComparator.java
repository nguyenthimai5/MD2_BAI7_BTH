package BTH3;

import java.util.Comparator;

public class CircleComparator extends Cricle implements Comparator<Cricle> {
    public CircleComparator() {
    }

    public CircleComparator(int radius) {
        super(radius);
    }

    public CircleComparator(String color, boolean filled, int radius) {
        super(color, filled, radius);
    }

    public int compare(Cricle c1, Cricle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else {
            return 0;
        }


    }
}
