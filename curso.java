public class curso {
    private String sigla;
    private String descricao;
    private int capacidade;

    public curso(String sigla, String descricao, int capacidade) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
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
        return "curso{" +
                "sigla='" + sigla + '\'' +
                ", descricao='" + descricao + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
