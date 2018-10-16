package HOME5;


import java.util.Scanner;

public class Calculator {


        public double calculate(double val1, double val2, String operator) {
            BinaryOperation operation = getOperationFor(operator);

            if (operation == null) {
                System.out.println("Неизвестный оператор " + operator);
                return Double.NaN;
            }

            return operation.resultFor(val1, val2);
        }

        private BinaryOperation getOperationFor(String operator) {

            switch (operator){
                case "*":
                    return new Multiplication();
                case "-":
                    return new Substraction();
                case "+":
                    return new Addition();
                case "/":
                    return new Division();
                case "^":
                    return new Exponentiation();
                case "log":
                    return new BaseLogarithm();
                case "sqrt":
                    return new RootNumber();
            }

            return null;
        }

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите операцию:");
            String operator = console.nextLine();
            System.out.println("Введите число X: ");
            double val1 = console.nextDouble();
            System.out.println("Введите число Y: ");
            double val2 = console.nextDouble();

            Calculator calculator = new Calculator();
            System.out.println("Результат: " + calculator.calculate(val1, val2, operator));
        }
    }

