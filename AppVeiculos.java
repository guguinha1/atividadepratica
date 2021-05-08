import java.util.Scanner;

public class AppVeiculos {
    public static void main(String[] args) {
        GerenciarVeiculos listaVeiculos = new GerenciarVeiculos();
        Scanner entradaText = new Scanner(System.in);
        Scanner entradaNumbersI = new Scanner(System.in);
        Scanner entradaNumbersD = new Scanner(System.in);
        int auxLoop = 0;
        int auxSwitch;
        String modelo, marca, placa, tipoCombustivel;
        int ano_fabricacao;
        double valor_mercado;

        System.out.println("------------------------------");
        System.out.println("|Bem vindo ao Cars Collection|");
        System.out.println("------------------------------");

        while (auxLoop != 8) {
            System.out.print(
                    "Digite: \n1 - Para adicionar veículos; \n2 - Para remover veículos; \n3 - Para buscar um veículo; \n4 - Para listar todos os veículos cadastrados; \n5 - Para listar veículos por tipo de combustível; \n6 - Para obter o valor do imposto de um determinado veículo; \n7 - Para sair do sistema. \n ");

            auxSwitch = entradaNumbersI.nextInt();

            switch (auxSwitch) {
                case 1:
                    System.out.print("Informe a marca: ");
                    marca = entradaText.next();
                    System.out.print("\n");
                    System.out.print("Informe o modelo: ");
                    modelo = entradaText.next();
                    System.out.print("\n");
                    System.out.print("Informe o ano de fabricação: ");
                    ano_fabricacao = entradaNumbersI.nextInt();
                    System.out.print("\n");
                    System.out.print("Informe o tipo de combustível: ");
                    tipoCombustivel = entradaText.next();
                    while (!tipoCombustivel.equals("alcool") && !tipoCombustivel.equals("gasolina")
                            && !tipoCombustivel.equals("flex") && !tipoCombustivel.equals("GNV")
                            && !tipoCombustivel.equals("diesel")) {
                        System.out.println("Tipo de combustível inválido!");
                        System.out.println(
                                "Informar novamente o tipo de combustível: (alcool, gasolina, flex, GNV ou diesel)");
                        tipoCombustivel = entradaText.next();
                    }
                    System.out.print("\n");
                    System.out.print("Informe a placa: ");
                    placa = entradaText.next();
                    System.out.print("\n");
                    System.out.print("Informe o valor de mercado: ");
                    valor_mercado = entradaNumbersD.nextDouble();
                    listaVeiculos.adicionar(
                            new Veiculo(marca, modelo, ano_fabricacao, tipoCombustivel, placa, valor_mercado));
                    System.out.println("Veículo cadastrado com sucesso!");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Informe a placa do veículo que deseja remover: ");
                    placa = entradaText.next();
                    listaVeiculos.remover(placa);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Informe a placa do veículo que deseja procurar: ");
                    placa = entradaText.next();
                    System.out.println(listaVeiculos.buscarPorPlaca(placa));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Veículos cadastrados:");
                    listaVeiculos.listarVeiculos();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Informe por qual tipo de combustível quer filtrar: ");
                    tipoCombustivel = entradaText.next();
                    System.out.println("Lista de veículos com o combustível informado: ");
                    listaVeiculos.listarVeiculosPorCombustivel(tipoCombustivel);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Informe a placa do veículo que deseja obter o valor de imposto: ");
                    placa = entradaText.next();
                    System.out.println(
                            "O valor de imposto para esse veículo é de: R$ " + listaVeiculos.obterValorImposto(placa));
                    System.out.println("");
                    break;

                case 7:
                    System.out.println("Obrigado por utilizar o nosso sistema, até breve!");
                    System.exit(0);
                    System.out.println("");
                default:
                    System.out.println("Opção Inválida!");
                    System.out.println("");
                    break;
            }
        }

        entradaText.close();
        entradaNumbersI.close();
        entradaNumbersD.close();
    }
}
