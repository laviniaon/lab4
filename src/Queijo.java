public class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Queijo";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 4.0;
    }
}