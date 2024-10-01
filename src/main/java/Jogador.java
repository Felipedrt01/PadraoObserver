import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void inscrever(Jogo jogo) {
        jogo.addObserver(this);
    }

    @Override
    public void update(Observable jogo, Object arg1) {
        this.ultimaNotificacao = this.nome + ", um novo jogo foi lançado: " + jogo.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
