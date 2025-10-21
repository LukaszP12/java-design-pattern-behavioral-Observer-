package ChainOfResponsibilityVsObserver.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        SupportTicketSystem supportTicketSystem = new SupportTicketSystem();

        BillingDept billingDept = new BillingDept();
        TechSupportDept techSupportDept = new TechSupportDept();

        supportTicketSystem.registerObserver(billingDept);
        supportTicketSystem.registerObserver(techSupportDept);

        supportTicketSystem.notifyObservers("Ticket system outage");
    }
}
