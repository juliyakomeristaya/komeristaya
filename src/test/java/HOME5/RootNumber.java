package HOME5;

public class RootNumber implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, 1.0 / right);
    }
}