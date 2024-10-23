package com.example.padraoobserver;

public class Main {
    public static void main(String[] args) {
        Editora editora = new Editora("Revista de Tecnologia");

        Assinante assinante1 = new Assinante("João");
        Assinante assinante2 = new Assinante("Maria");

        assinante1.assinar(editora);
        assinante2.assinar(editora);

        editora.publicarArtigo("Os Avanços da Inteligência Artificial");

        System.out.println(assinante1.getUltimaNotificacao());
        System.out.println(assinante2.getUltimaNotificacao());
    }
}
