package estrategia;
abstract class Personagem {
    protected String nome;
    protected Integer nivel;
    protected String classe;


    public Personagem(String nome, Integer nivel, String classe) {
        this.setNome(nome);
        this.setNivel(nivel);
        this.setClasse(classe);
    }


    public void nome() {
        this.setNome(nome);
    }

    public void nivel() {
        this.setNivel(nivel);
    }

    public void classe() {
        this.setClasse(classe);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
}