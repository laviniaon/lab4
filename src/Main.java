public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        CarroFacade carro = new CarroFacade(motor, cinto, porta, farol, radio);
        carro.dirigirCarro("91.7 FM");
        carro.finalizarCorrida();
    }
}
