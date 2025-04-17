import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensagens e entradas
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Limpar buffer

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Mensagem final
        String mensagem = "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo R$ ")
            .concat(String.format("%.2f", saldo))
            .concat(" já está disponível para saque.");

        System.out.println("\n" + mensagem);

        scanner.close();
    }
}