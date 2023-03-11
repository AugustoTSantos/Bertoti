package observer;

public class InscritoObserver implements InscritoObserverInterface {

    @Override
    public void updateVideo(String video) {
        System.out.println("novo video: " + video);
    }

    @Override
    public void updatePost(String post) {
        System.out.println("novo post: " + post);
    }

}
