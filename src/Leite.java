public class Leite extends CondimentoDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Leite";
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 2.0;
    }
}