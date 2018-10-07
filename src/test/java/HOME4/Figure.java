package HOME4;

import java.util.Scanner;

public class Figure {

    public static int selectionFigure (int number){
        switch (number){
            case 1:
                CreateSquare.main();
                break;
            case 2:
                CreateRectangle.main();
                break;
            case 3:
                CreateCircle.main();
                break;
            case 4:
                CreateTriangle.main();
                break;
            case 5:
                break;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите фигуру: \n" + "1. Квадрат\n" + "2. Прямоугольник\n" + "3. Круг\n"
                + "4. Триугольник\n" + "5. Выход");
        int number = console.nextInt();
        selectionFigure(number);
    }
}
