
public class Veiculo {
    private String modelo, marca, placa, tipoCombustivel;
    private int ano_fabricacao;
    private double valor_mercado;

    public Veiculo(String marca, String modelo, int ano_fabricacao, String tipoCombustivel, String placa,
            double valor_mercado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        this.tipoCombustivel = tipoCombustivel;
        this.placa = placa;
        this.valor_mercado = valor_mercado;
    }

    public double calcularImposto() {
        int aux = 2021 - ano_fabricacao;
        if (aux > 20) {
            System.out.println("Veículo isento de imposto!");
            return 0;
        } else {
            if (tipoCombustivel.equals("gasolina") || tipoCombustivel.equals("diesel")
                    || tipoCombustivel.equals("flex")) {
                return valor_mercado * 0.04;
            } else {
                return valor_mercado * 0.03;
            }
        }
    }

    public String imprimir() {
        return "Marca: " + marca + "; " + "Modelo: " + modelo + "; " + "Ano: " + ano_fabricacao + "; " + "Combustível: "
                + tipoCombustivel + "; " + "Placa: " + placa + "; " + "Valor: " + valor_mercado;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getAnoFabricacao() {
        return ano_fabricacao;
    }

    public double getValorMercado() {
        return valor_mercado;
    }

    public void setValorMercado(double valor) {
        this.valor_mercado = valor;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "; " + "Modelo: " + modelo + "; " + "Ano: " + ano_fabricacao + "; " + "Combustível: "
                + tipoCombustivel + "; " + "Placa: " + placa + "; " + "Valor: " + valor_mercado;
    }
}
