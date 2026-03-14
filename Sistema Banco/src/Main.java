import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoConta = 1000.00;
        int opcao = 0;

        System.out.println("Olá, Bem vindo ao Banco Digital!");
        System.out.println("----------------------------------");
        System.out.println("Digite Seu Nome: ");
        String nomeUsuario = scanner.nextLine();


        while (opcao != 4){
            System.out.println(nomeUsuario + " Escolhe uma dessas opções abaixo: ");
            System.out.println("1 - Consultar Saldo ");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf(nomeUsuario + " Seu Saldo atual é: R$ %.2f%n", saldoConta);
                    break;

                case 2:
                    System.out.println("Qual Valor você deseja depositar?  ");
                    double depositoUsuario = scanner.nextInt();
                    if (depositoUsuario > 0){
                        saldoConta = depositoUsuario + saldoConta;
                        System.out.printf("Foi depositado na sua conta R$ %.2f%n ", depositoUsuario);
                    }else {
                        System.out.println("Valor Incorreto!, Tente um valor mais alto!");
                    }
                    break;

                case 3:
                    System.out.println("Informe o valor do saque: ");
                    double sacar = scanner.nextDouble();
                    if (sacar > saldoConta){
                        System.out.println("Valor incorreto, o número do saque maior que o saldo atual");
                    }else if (sacar > 0 ){
                        saldoConta = saldoConta - sacar;
                        System.out.printf("Foi sacado da sua conta dinheiro no valor de R$ %.2f%n ", sacar);
                    }else {
                        System.out.println("Valor incorreto, tente um valor mais alto!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa....");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }


        }





    }
}
