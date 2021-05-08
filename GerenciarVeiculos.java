import java.util.ArrayList;

public class GerenciarVeiculos {
    private ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    public void adicionar(Veiculo a) {
        this.listaVeiculos.add(a);
    }

    public boolean remover(String placa) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                listaVeiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public Veiculo buscarPorPlaca(String placa) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        System.out.println("Veículo não encontrado!");
        return null;
    }

    public String listarVeiculos() {
        for (int i = 0; i < listaVeiculos.size(); i++) {
            System.out.println(this.listaVeiculos.get(i).toString());
        }
        return "";
    }

    public String listarVeiculosPorCombustivel(String combustivel) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getTipoCombustivel().equals(combustivel)) {
                System.out.println(veiculo);
            }
        }
        return null;
    }

    public double obterValorImposto(String placa) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo.calcularImposto();
            }
        }
        return -1;
    }

}
