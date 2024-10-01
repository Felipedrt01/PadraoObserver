import java.util.Observable;

public class Jogo extends Observable {

    private String titulo;
    private String genero;
    private String desenvolvedor;

    public Jogo(String titulo, String genero, String desenvolvedor) {
        this.titulo = titulo;
        this.genero = genero;
        this.desenvolvedor = desenvolvedor;
    }

    public void lancarJogo() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", desenvolvedor='" + desenvolvedor + '\'' +
                '}';
    }
}
