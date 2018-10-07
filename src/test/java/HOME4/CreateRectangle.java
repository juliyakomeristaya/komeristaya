package HOME4;

import java.util.Scanner;

public class CreateRectangle {

    private final float x;
    private final float y;
    private Rectangle area;

    public CreateRectangle(float x, float y) {
        this.x = x;
        this.y = y;
        area = new Rectangle(x,y);
    }

    @Override
    public String toString() {
        return "Прямоугольник " +
                "со сторонами " + x + " и " + y + " имеет площадь: " + area.calculatingArea()+
                " и периметр " + area.calculatingPerimeter();
    }

        public static void main(){
            Scanner console = new Scanner(System.in);
            System.out.println("Введите первую сторону прямоугольника: ");
            float x = console.nextFloat();
            System.out.println("Введите вторую сторону прямоугольника: ");
            float y = console.nextFloat();
            CreateRectangle rectangle1 = new CreateRectangle(x,y);
            System.out.println(rectangle1);
        }
    }
