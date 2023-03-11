package observer;

import java.util.ArrayList;
import java.util.List;

public class CanalSubject implements CanalSubjectInterface{

    private String video;
    private String post;
    private List<InscritoObserver> inscritos = new ArrayList<InscritoObserver>();


    public CanalSubject(String video, String post) {
        this.video = video;
        this.post = post;
    }


    @Override
    public void addInscrito(InscritoObserver inscrito) {
        inscritos.add(inscrito);
    }

    @Override
    public void removeInscrito(InscritoObserver inscrito) {
        inscritos.remove(inscrito);
    }

    @Override
    public void notifyInscritoVideo(InscritoObserver inscrito) {
        inscrito.updateVideo(video);
    }

    @Override
    public void notifyInscritoPost(InscritoObserver inscrito) {
        inscrito.updateVideo(post);
    }

    @Override
    public void notifyAllInscritosVideo() {
        for(InscritoObserver inscrito : inscritos) {
            inscrito.updateVideo(video);
        }
    }

    @Override
    public void notifyAllInscritosPost() {
        for(InscritoObserver inscrito : inscritos) {
            inscrito.updatePost(post);
        }
    }


    public String getVideo() {
        return video;
    }
    public void setVideo(String video) {
        this.video = video;
    }

    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }

    public List<InscritoObserver> getInscrito() {
        return inscritos;
    }
    public void setInscrito(List<InscritoObserver> inscritos) {
        this.inscritos = inscritos;
    }

}
