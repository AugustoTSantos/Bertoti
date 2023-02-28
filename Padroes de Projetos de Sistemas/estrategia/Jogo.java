package estrategia;

public class Jogo {
    private Personagem personagem;

    public void personagemAtacar() {
        personagem.atacar();
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }    
}
