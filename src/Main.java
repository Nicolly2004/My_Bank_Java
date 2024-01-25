import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int agencia ,conta;
        ContaInvestimentoInterface contaBank;

        System.out.println("Bem-vindo(a) ao My Bank");

        System.out.println("Informe sua agência:");
        agencia = scan.nextInt();

        System.out.println("Informe sua conta");
        conta = scan.nextInt();

        System.out.println("Estou carregando seus dados");
        contaBank = new ContaInvestimento (agencia,conta);

        boolean sair = false;
        while (!sair){
            System.out.println(contaBank) ;
            System.out.println("Você deseja:");
            System.out.println("1 - Depositar Valor");
            System.out.println("2 - Sacar Valor");
            System.out.println("3 - Investir um valor");
            System.out.println("0 - Sair");

            System.out.print("Informe a opção: ");
            int opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Informe o valor a ser depositado:");
                    double valorDeposito = scan.nextDouble();
                    contaBank.depositar(valorDeposito);
                    System.out.println("O valor de "+valorDeposito + " foi depositado com sucesso!");
                    break;


                case 2:
                    System.out.print("Informe o valor a ser sacado:");
                    double valorSaque = scan.nextDouble();
                    contaBank.sacarValor(valorSaque);
                    System.out.println("O valor de "+valorSaque + " foi sacado com sucesso!");
                    break;

                case 3:
                    System.out.print("Informe o valor a ser aplicado: ");
                    int valorAplicacao = scan.nextInt();
                    contaBank.depositar(valorAplicacao);
                    System.out.println("O valor de "+valorAplicacao + "foi aplicado com sucesso");
                    break;

                case 0:
                    System.out.print("Obridado por utilizar nosso programa...Saindo!!!");
                    break;
                default:
                    System.out.print("Opção Inválida,tente novamente!");
            }


        }



    }
}