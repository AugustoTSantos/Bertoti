package composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoForma implements IForma {
    private String nome;
    private List<Forma> formas = new ArrayList<Forma>();


    public GrupoForma(String nome) {
        this.nome = nome;
    }


    public void addForma(Forma forma) {
        formas.add(forma);
    }

    public void removeForma(Forma forma) {
        formas.remove(forma);
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCor() {
        String cor = "";
        for(Forma forma : formas) {
            cor = forma.getCor();
        }
        return cor;
    }

    @Override
    public void imprimir() {
        for(Forma forma : formas) {
            forma.imprimir();
        }
    }

}
