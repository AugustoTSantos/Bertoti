package estrategia;

public class Mago extends Personagem{

    public Mago(String nome, Integer nivel, String classe) {
        super(nome, nivel, classe);
    }

    public void soltarMagia() {
        System.out.println("Soltando Magia");
    }
}
