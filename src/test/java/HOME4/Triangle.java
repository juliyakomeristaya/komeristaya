package HOME4;

class Triangle {
    private final float x;
    private final float y;
    private final float z;

    public Triangle(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float calculatingArea() {
        float c = (x + y + z) / 2;
        return (float) (Math.sqrt(c * (c - x) * (c - y) * (c - z)));
    }
    public float calculatingPerimeter() {
        return (float) (x + y + z);
    }
}
