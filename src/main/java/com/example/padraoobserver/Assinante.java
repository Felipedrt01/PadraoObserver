package com.example.padraoobserver;

import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Assinante(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void assinar(Editora editora) {
        editora.addObserver(this);
    }

    public void update(Observable editora, Object arg1) {
        this.ultimaNotificacao = this.nome + ", novo artigo publicado: " + editora.toString();
    }
}
