public class Pizzaria {
    public static void main(String[] args) {
        Pizza marguerita = new MassaFinaPizza();
        marguerita = new Queijo(marguerita);
        marguerita = new Tomate(marguerita);
        System.out.println(marguerita.getDescricao() + " -> Custo: R$ " + marguerita.getCusto());

        Pizza portuguesa = new MassaEspessaPizza();
        portuguesa = new Queijo(portuguesa);
        portuguesa = new Ovo(portuguesa);
        portuguesa = new Tomate(portuguesa);
        System.out.println(portuguesa.getDescricao() + " -> Custo: R$ " + portuguesa.getCusto());
    }
}