package ChainOfResponsibilityVsObserver.Chain;

public class CustomerServiceSupport extends SupportHandler {
    @Override
    public void handle(String issue) {
        System.out.println("Customer Service: General help for → " + issue);
    }
}
