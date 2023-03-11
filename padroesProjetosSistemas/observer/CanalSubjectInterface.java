package observer;

public interface CanalSubjectInterface {

    public void addInscrito(InscritoObserver inscrito);

    public void removeInscrito(InscritoObserver inscrito);

    public void notifyInscritoVideo(InscritoObserver inscrito);

    public void notifyInscritoPost(InscritoObserver inscrito);

    public void notifyAllInscritosVideo();

    public void notifyAllInscritosPost();

}
