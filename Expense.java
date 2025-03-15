import java.util.List;
import java.util.Map;

abstract class Expense {
    double totalAmount;
    String name;
    protected User giver;
    protected List<User> takers;
    protected Map<User, Double> userSplits;
    protected SplitStrategy splitStrategy;
    
    public Expense(String name,double totalAmount, User giver, List<User> takers, SplitStrategy splitStrategy) {
        this.name=name;
        this.totalAmount = totalAmount;
        this.giver = giver;
        this.takers = takers;
        this.userSplits = null;
        this.splitStrategy = splitStrategy;
    }
    public Expense(String name, double totalAmount, User giver, List<User> takers, Map<User, Double> userSplits, SplitStrategy splitStrategy) {
        this.name=name;
        this.totalAmount = totalAmount;
        this.giver = giver;
        this.takers = takers;
        this.userSplits = userSplits;
        this.splitStrategy = splitStrategy;
    }
    public abstract void calculateShares();
    protected abstract String getName();
    protected abstract User getGiver();
    protected abstract List<User> getTakers();
}
