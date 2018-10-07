package L3;

public class Car {
    private String vin;
    private Vector2d position;

    public Car(String vin) {
        this.vin = vin;
        position = new Vector2d(4.5f, 5.5f);
    }

    public void drive(Vector2d direction, int time) {
        position = position.add(direction.mul(time));
    }

    public boolean equals (Object other){
         if (this == other){
             return true;
         }
         if (other instanceof Car){
             return false;
         }
         if (other == null) {
             return false;
         }
         Car c = (Car) other;
         return c.vin.equals(c.vin);
    }

    @Override
    public String toString() {
        return "Car " +
                "vin " +vin;
    }

    public static void main(String[] args) {
        Car car = new Car("srtey");
        System.out.println(car);
    }
}