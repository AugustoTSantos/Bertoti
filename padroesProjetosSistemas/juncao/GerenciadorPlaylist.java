package juncao;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPlaylist {
    private static GerenciadorPlaylist instance;
    private List<IObserver> observers;

    private GerenciadorPlaylist() {
        observers = new ArrayList<>();
    }

    public static GerenciadorPlaylist getInstance() {
        if (instance == null) {
            instance = new GerenciadorPlaylist();
        }
        return instance;
    }

    public void adicionarObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (IObserver observer : observers) {
            observer.atualizar();
        }
    }
}
