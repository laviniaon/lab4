public class CinematecaFacade {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca maquinaPipoca;
    private Projetor projetor;
    private PlayerDeStreaming player;
    private Telao telao;

    public CinematecaFacade(Amplificador amp, Luzes luz, MaquinaDePipoca pipoca, Projetor proj, PlayerDeStreaming pl, Telao t) {
        this.amplificador = amp;
        this.luzes = luz;
        this.maquinaPipoca = pipoca;
        this.projetor = proj;
        this.player = pl;
        this.telao = t;
    }

    public void assistirFilme(String filme) {
        maquinaPipoca.liga();
        maquinaPipoca.arrebentaPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajusteDeVolume(10);
        player.liga();
        player.play(filme);
    }

    public void fimDoFilme() {
        System.out.println("\nFinalizando o filme...");
        player.desliga();
        amplificador.desliga();
        projetor.desliga();
        telao.sobe();
        luzes.liga();
        maquinaPipoca.desliga();
    }

    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Luzes luz = new Luzes();
        MaquinaDePipoca pipoca = new MaquinaDePipoca();
        Projetor proj = new Projetor();
        PlayerDeStreaming player = new PlayerDeStreaming();
        Telao telao = new Telao();

        CinematecaFacade homeTheater = new CinematecaFacade(amp, luz, pipoca, proj, player, telao);
        homeTheater.assistirFilme("Interestelar");
        homeTheater.fimDoFilme();
    }
}