package Engine;

public class Engine {
    public static void main(String[] args) {
        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);

        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);

        System.out.println(((Circle) circle).getRadius());

    }
}