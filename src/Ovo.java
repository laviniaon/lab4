public class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Ovo";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 3.0;
    }
}