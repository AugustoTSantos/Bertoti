package Bertoti.PlataformaComunicacao;

import java.util.List;
import java.util.LinkedList;

public class PlataformaComunicacao {

    final List<Pessoas> pessoas = new LinkedList<>();
    void cadastrarPessoas(Pessoas pessoas) {
        pessoas.add(pessoas);
    }
    List<Pessoas> getPessoas() {
        return pessoas;
    }

    final List<Disciplina> disciplinas = new LinkedList<>();
    void cadastrarDisciplina(Disciplina disciplina) {
        disciplina.add(disciplina);
    }
    List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

}
