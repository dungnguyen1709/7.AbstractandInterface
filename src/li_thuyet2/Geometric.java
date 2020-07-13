package li_thuyet2;

public abstract class Geometric {
    private String color;
    private boolean fill;

    public Geometric(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public abstract void draw();
    public abstract double perimeter();
    public abstract double area();
}
