package PR3;

public class FourCheessesBaker extends AbstractPizzeBaker {
    public FourCheessesBaker(){
        super("4 сыра");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Добавление ингредиентов:");
        System.out.println("сыр с плесенью");
        System.out.println("сулугуни");
        System.out.println("бри");
        System.out.println("сыр ореховый");
        System.out.println("зелень");
    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем и ждем");
            Thread.sleep(Long.parseLong("10000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
