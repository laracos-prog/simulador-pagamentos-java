public class PaymentProcessor {

    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        double total = strategy.calculateTotal(amount);

        System.out.println("Forma de pagamento: "
                + strategy.getName());

        System.out.printf(
                "Valor original: R$ %.2f%n", amount);

        System.out.printf(
                "Valor final: R$ %.2f%n", total);

        System.out.println("Simulacao concluida!");
    }
}