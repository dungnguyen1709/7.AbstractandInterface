package colorable_cac_lop_hinh_hoc;

import colorable_cac_lop_hinh_hoc.shape.Circle;
import colorable_cac_lop_hinh_hoc.shape.Rectangle;
import colorable_cac_lop_hinh_hoc.shape.Shape;
import colorable_cac_lop_hinh_hoc.shape.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[]shapes = new Shape[3];
        shapes[0] = new Circle(1.0);
        shapes[1] = new Rectangle(1.2,3.4);
        shapes[2] = new Square(5.6);

        System.out.println(" Pre : ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println(" After : ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                System.out.println(((Square) shape).howToColor());
            }
        }
    }
}
