package estrategia;
public class Guerreiro extends Personagem{

    public Guerreiro(String nome, Integer nivel, String classe) {
        super(nome, nivel, classe);
    }
    
    public void atacar() {
        System.out.println("atacando");
    }
}
