package li_thuyet2;

public abstract class Square extends Geometric {

    public Square(String color, boolean fill) {
        super(color, fill);
    }

    @Override
    public void draw() {
        System.out.println(" Day la hinh vuong ");
    }
}
