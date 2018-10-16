package PR3;

public class CarbonaraBaker extends AbstractPizzeBaker {

    public  CarbonaraBaker (){
        super("Carbonara");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Добавление ингредиентов:");
        System.out.println("сыр");
        System.out.println("томаты");
        System.out.println("соус");
        System.out.println("салями");
    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем и ждем");
            Thread.sleep(Long.parseLong("15000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
