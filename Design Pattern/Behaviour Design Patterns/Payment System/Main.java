public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.processPayment(100);
        
        processor.setPaymentStrategy(new PayPalPayment());
        processor.processPayment(200);
    }
}
