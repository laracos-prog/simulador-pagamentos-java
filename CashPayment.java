public class CashPayment implements PaymentStrategy {

    @Override
    public String getName() {
        return "Dinheiro";
    }

    @Override
    public double calculateTotal(double amount) {
        return amount;
    }
}