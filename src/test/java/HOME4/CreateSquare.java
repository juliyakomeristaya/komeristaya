package HOME4;

import java.util.Scanner;

public class CreateSquare {

    private final float x;
    private Square area;

    public CreateSquare(float x) {
        this.x = x;
        area = new Square(x);
    }

    @Override
    public String toString() {
        return "Квадрат " +
                "со стороной " + x + " имеет площадь: " + area.calculatingArea()+
                " и периметр " + area.calculatingPerimeter();
    }

        public static void main(){
            Scanner console = new Scanner(System.in);
            System.out.println("Введите сторону квадрата");
            float x = console.nextFloat();
            CreateSquare square1 = new CreateSquare(x);
            System.out.println(square1);
        }
    }
