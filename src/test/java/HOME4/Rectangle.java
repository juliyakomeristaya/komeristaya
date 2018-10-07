package HOME4;

class Rectangle {
    private final float x;
    private final float y;

    public Rectangle(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float calculatingArea() {
        return (float) (x * y);
    }
    public float calculatingPerimeter() {
        return (float) (2 * x + 2 * y);
    }
}
