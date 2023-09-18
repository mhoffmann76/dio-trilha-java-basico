import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Por favor, digite o número da agência:\n");
        String agencia = scanner.next();
        System.out.printf("Informe sua conta corrente:\n");
        int contaCorrente = scanner.nextInt();
        System.out.println("Informe o nome do correntista:");
        String nomeCliente = scanner.next();
        scanner.nextLine();
        System.out.println("Informe o valor do depósito: ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + contaCorrente + " e seu saldo é de " + saldo);

        scanner.close();

    }
}
