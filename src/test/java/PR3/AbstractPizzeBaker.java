package PR3;

public abstract class AbstractPizzeBaker {
    protected final String kindOfPizza;

    protected AbstractPizzeBaker(String kindOfPizza) {
        this.kindOfPizza = kindOfPizza;
    }

    public String cookPizza(){
        getHarvesting();
        addIngredients();
        bake();
        slice();
        box();
        return kindOfPizza;
    }

    private   void  getHarvesting(){
        System.out.println("Берем заготовку для пицци");
    }

    protected abstract void addIngredients();

    protected abstract void bake();

    private  void  slice(){
        System.out.println("Нарезаем пиццу на 8 кусочков");
    }

    private  void  box(){
        System.out.println("Запоковуем пиццу");
    }
}
