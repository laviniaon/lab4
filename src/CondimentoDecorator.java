public abstract class CondimentoDecorator implements Bebida {
    protected Bebida bebidaDecorada;

    public CondimentoDecorator(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao();
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto();
    }
}