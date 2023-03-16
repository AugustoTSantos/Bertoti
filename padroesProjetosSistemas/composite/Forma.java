package composite;

public class Forma implements IForma {
    private String nome;
    private String cor;


    public Forma(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void imprimir() {
        System.out.println("A forma é " + getNome() + " e ela é " + getCor());
    }

}
