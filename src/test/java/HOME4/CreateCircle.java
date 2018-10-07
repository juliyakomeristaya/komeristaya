package HOME4;

import java.util.Scanner;

public class CreateCircle {

    private final float x;
    private Сircle area;

    public CreateCircle(float x) {
        this.x = x;
        area = new Сircle(x);
    }

    @Override
    public String toString() {
        return "Круг " +
                "с радиусом " + x + " имеет площадь: " + area.calculatingArea()+
                " и периметр " + area.calculatingPerimeter();
    }

        public static void main(){
            Scanner console = new Scanner(System.in);
            System.out.println("Введите радиус круга");
            float x = console.nextFloat();
            CreateCircle сircle1 = new CreateCircle(x);
            System.out.println(сircle1);
        }
    }
