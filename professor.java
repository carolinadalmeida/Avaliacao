public class professor {
    private String nome;
    private disciplina disciplina;

    public professor(String nome, disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "professor{" +
                "Nome='" + nome + '\'' +
                ", Disciplina='" + disciplina + '\'' +
                '}';
    }
}
