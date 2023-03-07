package observer;

import java.util.ArrayList;
import java.util.List;

public class Anuncio implements Subject{
    public List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerObserver'");
    }
    
    private void notifyObservers (Anuncio anuncio) {
        observers.forEach(o -> o.notify());
    }
}
