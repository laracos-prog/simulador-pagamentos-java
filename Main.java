import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SIMULADOR DE PAGAMENTOS ===");

        System.out.print("Digite o valor da compra: R$ ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Valor invalido.");
            scanner.close();
            return;
        }

        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("O valor deve ser maior que zero.");
            scanner.close();
            return;
        }

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - PIX (5% de desconto)");
        System.out.println("2 - Cartao de credito (3% de taxa)");
        System.out.println("3 - Dinheiro");
        System.out.print("Opcao: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Opcao invalida.");
            scanner.close();
            return;
        }

        int option = scanner.nextInt();
        PaymentStrategy strategy;

        switch (option) {
            case 1:
                strategy = new PixPayment();
                break;

            case 2:
                strategy = new CreditCardPayment();
                break;

            case 3:
                strategy = new CashPayment();
                break;

            default:
                System.out.println("Opcao invalida.");
                scanner.close();
                return;
        }

        PaymentProcessor processor =
                new PaymentProcessor(strategy);

        System.out.println();
        processor.processPayment(amount);

        scanner.close();
    }
}