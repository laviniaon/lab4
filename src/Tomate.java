public class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Tomate";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 2.5;
    }
}