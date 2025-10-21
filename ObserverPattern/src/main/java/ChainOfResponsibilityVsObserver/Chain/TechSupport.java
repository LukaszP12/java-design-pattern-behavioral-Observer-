package ChainOfResponsibilityVsObserver.Chain;

public class TechSupport extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.contains("error")) {
            System.out.println("Tech Support: Solved issue → " + issue);
        } else if (next != null) {
            next.handle(issue);
        }
    }
}
