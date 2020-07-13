package colorable_cac_lop_hinh_hoc.shape;

import colorable_cac_lop_hinh_hoc.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square ( double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }


    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return " A Square with side = " +getSide() +", which is a subclass of " + super.toString();
    }

    @Override
    public String howToColor() {
        return " Color all four side ! ";
    }
}
