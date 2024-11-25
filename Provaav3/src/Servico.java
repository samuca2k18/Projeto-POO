public abstract class Servico {
    private int id;
    private String descricao;
    private double preco;
    private String status;

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", status='" + status + '\'' +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getStatus() {
        return status;
    }

    public void alterarStatus(String novoStatus){
        this.status = novoStatus;
    }

    public abstract double calcularCusto();

}
