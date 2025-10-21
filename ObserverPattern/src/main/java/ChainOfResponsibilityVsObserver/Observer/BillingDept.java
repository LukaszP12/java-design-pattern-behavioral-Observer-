package ChainOfResponsibilityVsObserver.Observer;

public class BillingDept implements Observer{
    @Override
    public void update(String issue) {
        System.out.println("Billing checking issue: " + issue);
    }
}
