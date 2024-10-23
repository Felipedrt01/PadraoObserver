package com.example.padraoobserver;

import java.util.Observable;

public class Editora extends Observable {

    private String nomeEditora;
    private String ultimoArtigo;

    public Editora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public void publicarArtigo(String artigo) {
        this.ultimoArtigo = artigo;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Editora{" +
                "nomeEditora='" + nomeEditora + '\'' +
                ", ultimoArtigo='" + ultimoArtigo + '\'' +
                '}';
    }
}
