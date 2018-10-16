package HOME5;

public class Exponentiation implements BinaryOperation{

    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }

}
