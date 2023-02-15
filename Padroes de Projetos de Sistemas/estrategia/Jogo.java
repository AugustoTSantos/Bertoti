package estrategia;

public class Jogo {
    private Personagem personagem;

    public Jogo(Personagem personagem) {
        this.personagem = personagem;
    }

    public void personagemAtacar() {
        personagem.atacar();
    }
}
