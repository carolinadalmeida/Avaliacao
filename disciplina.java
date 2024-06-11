public class disciplina {
    private String sigla;
    private String descricao;

    public disciplina(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "disciplina{" +
                "Sigla='" + sigla + '\'' +
                ", Descricao='" + descricao + '\'' +
                '}';
    }
}
