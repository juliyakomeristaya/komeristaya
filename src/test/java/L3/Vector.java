package L3;

class Vector2d {
    private final float x;
    private final float y;

    public Vector2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getlen() {
        return (float) Math.sqrt(x * x + y * y);
    }
    public Vector2d add(Vector2d other){
        return new Vector2d(x + other.x, y - other.y);
    }
    public Vector2d mul(int number) {
        return new Vector2d(x + x-1, y - y-1);
    }

    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    public static void main(String[] args) {
        Vector2d v1 = new Vector2d(10, 20);
        System.out.println("len" + v1.getlen());
        System.out.println(v1);
        Vector2d v2 = new Vector2d(13.4f, 345.4f);
        System.out.println(v2);
        Vector2d v3 = v1.add(v2);
        System.out.println(v3);
    }
}