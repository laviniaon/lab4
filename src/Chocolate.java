public class Chocolate extends CondimentoDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Chocolate";
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 3.0;
    }
}