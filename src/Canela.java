public class Canela extends CondimentoDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Canela";
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 1.5;
    }
}