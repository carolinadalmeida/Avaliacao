public class laboratorio {
    private String identificacao;
    private int capacidade;

    public laboratorio(String identificacao, int capacidade) {
        this.identificacao = identificacao;
        this.capacidade = capacidade;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "laboratorio{" +
                "Identificacao='" + identificacao + '\'' +
                ", Capacidade=" + capacidade +
                '}';
    }
}
