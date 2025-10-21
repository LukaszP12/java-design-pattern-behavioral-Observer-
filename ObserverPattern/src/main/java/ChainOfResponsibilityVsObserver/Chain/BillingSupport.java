package ChainOfResponsibilityVsObserver.Chain;

public class BillingSupport extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.contains("payment")) {
            System.out.println("Billing: Solved issue → " + issue);
        } else if (next != null) {
            next.handle(issue);
        }
    }
}
