public class CreditCardPayment implements PaymentStrategy {

    @Override
    public String getName() {
        return "Cartao de credito";
    }

    @Override
    public double calculateTotal(double amount) {
        return amount * 1.03;
    }
}