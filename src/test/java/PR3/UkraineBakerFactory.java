package PR3;

public class UkraineBakerFactory implements PizzaBakerFactory{

    public AbstractPizzeBaker getPizzaBaker(Buttons button){
        switch (button){
            case BUTTON_A:
                return new FourCheessesBaker();
            case BUTTON_B:
                return new CarbonaraBaker();
            case BUTTON_C:
                return new PepperonyBaker();
            case BUTTON_D:
                return new PoloBaker();
        }
        return null;
    }
}
