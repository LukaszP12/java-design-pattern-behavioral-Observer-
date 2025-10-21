package ChainOfResponsibilityVsObserver.Chain;

public class ChainDemo {
    public static void main(String[] args) {
        // Build chain
        SupportHandler billing = new BillingSupport();
        SupportHandler tech = new TechSupport();
        SupportHandler customerService = new CustomerServiceSupport();

        billing.setNext(tech).setNext(customerService);

        // Test chain
        billing.handle("payment refund request");
        billing.handle("application error on startup");
        billing.handle("how to reset password?");
    }
}
