package Engine;

final class Rectangle implements MutableShape {
    // Определяет Х и Y координату верхнего левогоX и правогоY угла прямоугольника
    private float x;
    private float y;
    private float width;//определяет ширину прямоугольника
    private float height;//определяет высоту прямоугольника

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
    }

    @Override
    public void scale(float factor) {
        this.width *= factor;
        this.height *= factor;
    }
}