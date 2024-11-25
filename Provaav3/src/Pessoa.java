public abstract class Pessoa {
    private String nome;
    private int cpf;
    private String teleforne;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", teleforne='" + teleforne + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTeleforne() {
        return teleforne;
    }

    public void setTeleforne(String teleforne) {
        this.teleforne = teleforne;
    }

    public abstract String gerarRelatorioAtividades();


}
