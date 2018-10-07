package HOME4;

class Сircle {
    private final float x;
    private final double p = 3.14;

    public Сircle(float x) {
        this.x = x;
    }

    public float calculatingArea() {
        return (float) (Math.pow(x, 2) * p);
    }
    public float calculatingPerimeter() {
        return (float) (2 * x * p);
    }
}
