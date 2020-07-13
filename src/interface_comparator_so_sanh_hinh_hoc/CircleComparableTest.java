package interface_comparator_so_sanh_hinh_hoc;

import colorable_cac_lop_hinh_hoc.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparableTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.7, "blue", false);

        System.out.println(" Pre-sorted : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparable = new CircleComparable();
        Arrays.sort(circles,circleComparable);

        System.out.println(" After-sorted : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
