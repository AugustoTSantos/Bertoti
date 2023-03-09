package estrategia;

public class Master {

    public static void main(String[] args) {
        
        Jogo p1 = new Jogo();

        p1.setPersonagem(new Mago());

        p1.personagemAtacar();
        
    }
    
}
