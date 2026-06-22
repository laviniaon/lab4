public class Cafeteria {
    public static void main(String[] args) {
        Bebida cafe1 = new Espresso();
        cafe1 = new Leite(cafe1);
        cafe1 = new Chocolate(cafe1);
        System.out.println(cafe1.getDescricao() + " | Custo total: R$ " + cafe1.calculaCusto());

        Bebida cafe2 = new Decaf();
        cafe2 = new Canela(cafe2);
        System.out.println(cafe2.getDescricao() + " | Custo total: R$ " + cafe2.calculaCusto());
    }
}