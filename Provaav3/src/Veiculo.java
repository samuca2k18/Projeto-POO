public abstract class Veiculo {
    private int ano;
    private String placa;
    private boolean seguro;
    private String marca;
    private String modelo;

    @Override
    public String toString() {
        return "Veiculo{" +
                "ano=" + ano +
                ", placa=" + placa +
                ", seguro=" + seguro +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public abstract double calcularCustoManutencao();

    public int calcularIdade(int anoAtual){
        return anoAtual - this.ano;
    }

}
