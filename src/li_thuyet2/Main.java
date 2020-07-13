package li_thuyet2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red",true,10);
        circle.draw();
        System.out.println(circle.perimeter());

        SubSquare subSquare  = new SubSquare("blue",false);
        subSquare.draw();

    }
}
