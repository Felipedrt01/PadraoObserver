public class Main {

    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("Super Adventure", "Aventura", "Game Studios");
        Jogador jogador1 = new Jogador("Carlos");
        Jogador jogador2 = new Jogador("Ana");

        jogador1.inscrever(jogo1);
        jogador2.inscrever(jogo1);

        jogo1.lancarJogo();

        System.out.println(jogador1.getUltimaNotificacao());
        System.out.println(jogador2.getUltimaNotificacao());
    }
}
