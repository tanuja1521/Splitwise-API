import java.util.List;
import java.util.Map;

public class UnequalExpense extends Expense {

    public UnequalExpense(String name, double totalAmount, User giver, List<User> takers, Map<User,Double> userSplits, SplitStrategy splitStrategy) {
        super(name, totalAmount, giver, takers, userSplits, splitStrategy);
    }

    @Override
    public void calculateShares() {
        splitStrategy.splitExpense(this.totalAmount, this.takers, this.userSplits);
    }

    @Override
    protected String getName() {
        return this.name;
    }

    @Override
    protected User getGiver() {
        return this.giver;
    }

    @Override
    protected List<User> getTakers() {
        return this.takers;
    }
} 
