package Lab2.PlataformaComunicacao;

public class Disciplina {
    String nome;
    String turma;
    String professor;

    Disciplina(String nome, String turma, String professor) {
        this.nome = nome;
        this.turma = turma;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String novaTurma) {
        this.turma = novaTurma;
    }

    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String novoProfessor) {
        this.professor = novoProfessor;
    }

    public void add(Disciplina disciplina) {
    }
}
