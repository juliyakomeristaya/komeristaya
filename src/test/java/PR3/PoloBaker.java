package PR3;

public class PoloBaker extends AbstractPizzeBaker {

    public PoloBaker(){
        super("Polo");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Добавление ингредиентов:");
        System.out.println("сыр");
        System.out.println("ананас");
        System.out.println("оливки");
        System.out.println("курица");
    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем и ждем");
            Thread.sleep(Long.parseLong("18000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
