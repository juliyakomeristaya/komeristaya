package PR3;

public class Automate {
    public static void main(String[] args) {
//        UkraineBakerFactory pizzaBakerFactory = new UkraineBakerFactory();
//        AbstractPizzeBaker pizzeBaker = pizzaBakerFactory.getPizzaBaker(Buttons.BUTTON_C);
//        System.out.println("Съели пиццу " + pizzeBaker.cookPizza());
        PizzaBakerFactory pizzaBakerFactory = new UkraineBakerFactory();
        AbstractPizzeBaker pizzeBaker = pizzaBakerFactory.getPizzaBaker(Buttons.BUTTON_C);
        System.out.println("Съели пиццу " + pizzeBaker.cookPizza());

    }
}
