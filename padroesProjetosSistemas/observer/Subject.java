package observer;

// Quem está sendo observado
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notify(Observer observer);
}
