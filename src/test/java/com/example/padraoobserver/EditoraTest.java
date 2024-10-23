package com.example.padraoobserver;

import org.junit.Before;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class EditoraTest {

    private Editora editora;
    private Assinante assinante1;
    private Assinante assinante2;

    @Before
    public void setUp() {
        editora = new Editora("Revista de Tecnologia");
        assinante1 = new Assinante("João");
        assinante2 = new Assinante("Maria");
        assinante1.assinar(editora);
        assinante2.assinar(editora);
    }

    @Test
    public void testPublicarArtigoNotificaAssinantes() {
        editora.publicarArtigo("Os Avanços da Inteligência Artificial");

        // Verifica se os assinantes receberam a notificação correta
        assertEquals("João, novo artigo publicado: Editora{nomeEditora='Revista de Tecnologia', ultimoArtigo='Os Avanços da Inteligência Artificial'}", assinante1.getUltimaNotificacao());
        assertEquals("Maria, novo artigo publicado: Editora{nomeEditora='Revista de Tecnologia', ultimoArtigo='Os Avanços da Inteligência Artificial'}", assinante2.getUltimaNotificacao());
    }

    @Test
    public void testPublicarVariosArtigosNotificaAssinantes() {
        editora.publicarArtigo("Os Avanços da Inteligência Artificial");
        editora.publicarArtigo("Tendências de Tecnologia para 2025");

        // Verifica se os assinantes receberam a última notificação correta
        assertEquals("Maria, novo artigo publicado: Editora{nomeEditora='Revista de Tecnologia', ultimoArtigo='Tendências de Tecnologia para 2025'}", assinante2.getUltimaNotificacao());
    }
}
