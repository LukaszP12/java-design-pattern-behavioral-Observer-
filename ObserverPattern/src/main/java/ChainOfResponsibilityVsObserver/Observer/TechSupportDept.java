package ChainOfResponsibilityVsObserver.Observer;

public class TechSupportDept implements Observer{
    @Override
    public void update(String issue) {
        System.out.println("Tech Support analyzing issue: " + issue);
    }
}
