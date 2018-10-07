package HOME4;

class Square {
    private final float x;

    public Square(float x) {
        this.x = x;
    }

    public float calculatingArea() {
        return (float) Math.pow(x, 2);
    }
    public float calculatingPerimeter() {
        return (float) (4 * x);
    }
}
