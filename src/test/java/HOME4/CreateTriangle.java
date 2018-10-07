package HOME4;

import java.util.Scanner;

public class CreateTriangle {

    private final float x;
    private final float y;
    private final float z;
    private Triangle area;

    public CreateTriangle(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        area = new Triangle(x,y,z);
    }

    @Override
    public String toString() {
        return "Треугольник " +
                "со сторонами " + x + " " + y + " и " + z + " имеет площадь: " + area.calculatingArea()+
                " и периметр " + area.calculatingPerimeter();
    }

        public static void main(){
            Scanner console = new Scanner(System.in);
            System.out.println("Введите первую сторону треугольника: ");
            float x = console.nextFloat();
            System.out.println("Введите вторую сторону треугольника: ");
            float y = console.nextFloat();
            System.out.println("Введите третью сторону треугольника: ");
            float z = console.nextFloat();
            CreateTriangle triangle1 = new CreateTriangle(x,y,z);
            System.out.println(triangle1);
        }
    }
