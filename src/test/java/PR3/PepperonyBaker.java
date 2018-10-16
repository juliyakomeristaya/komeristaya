package PR3;

public class PepperonyBaker extends AbstractPizzeBaker {

    public PepperonyBaker(){
        super("Papperony");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Добавление ингредиентов:");
        System.out.println("сыр");
        System.out.println("томаты");
        System.out.println("соус");
        System.out.println("перец");
        System.out.println("курица");
    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем и ждем");
            Thread.sleep(Long.parseLong("21000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
