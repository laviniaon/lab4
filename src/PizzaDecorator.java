public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaDecorada;

    public PizzaDecorator(Pizza pizza) {
        this.pizzaDecorada = pizza;
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao();
    }

    @Override
    public double getCusto() {
        return pizzaDecorada.getCusto();
    }
}