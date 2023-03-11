package observer;

public class master {
    public static void main(String[] args) {

        CanalSubject canalSubject1 = new CanalSubject("video1", "post1");
        InscritoObserver inscritoObserver1 = new InscritoObserver();
        InscritoObserver inscritoObserver2 = new InscritoObserver();

        canalSubject1.addInscrito(inscritoObserver1);
        canalSubject1.addInscrito(inscritoObserver2);

        canalSubject1.notifyAllInscritosPost();

        canalSubject1.removeInscrito(inscritoObserver1);

        canalSubject1.notifyAllInscritosVideo();
    }

}

