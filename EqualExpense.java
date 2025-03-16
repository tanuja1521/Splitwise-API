import java.util.List;

public class EqualExpense extends Expense {

    public EqualExpense(String name, double totalAmount, User giver, List<User> takers, SplitStrategy splitStrategy) {
        super(name, totalAmount, giver, takers, new EqualSplitStrategy());
    }

    @Override
    public void calculateShares() {
        splitStrategy.splitExpense(this.totalAmount, this.takers, this.userSplits);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public User getGiver() {
         return this.giver;
    }

    public List<User> getTakers() {
        return this.takers;
    }
    
}