package interface_comparator_so_sanh_hinh_hoc;

import colorable_cac_lop_hinh_hoc.shape.Circle;

import java.util.Comparator;

public class CircleComparable implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
