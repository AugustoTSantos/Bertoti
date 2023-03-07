package observer;

// Quem está sendo observado
public interface Subject {
    void registerObserver(Observer observer);
}
