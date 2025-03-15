
import java.util.List;
import java.util.Map;

public class UnequalExpenseFactory implements ExpenseFactory{

    @Override
    public Expense createExpense(String name, double totalAmount, User giver, List<User> users, Map<User, Double> userSplits,
            SplitStrategy splitStrategy) {
                UnequalExpense expense = new UnequalExpense(name, totalAmount, giver, users, userSplits, splitStrategy);
        return expense;
    }

    @Override
    public Expense createExpense(String name,double totalAmount, User giver, List<User> users) {
        return null;
    }
    
}