package estrategia;
public class Main {
    public static void main(String[] args) {
        Personagem GronkObj = new Guerreiro();
        Jogo Gronk = new Jogo(GronkObj);

        Personagem EdieObj = new Mago();
        Jogo Edie = new Jogo(EdieObj);

        Gronk.personagemAtacar();
        Edie.personagemAtacar();
    }
}