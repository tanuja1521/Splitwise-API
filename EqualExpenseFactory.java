import java.util.List;
import java.util.Map;

public class EqualExpenseFactory implements ExpenseFactory{

    @Override
    public Expense createExpense(String name, double totalAmount, User giver, List<User> users, Map<User, Double> userSplits,
            SplitStrategy splitStrategy) {
        return null;
    }

    @Override
    public Expense createExpense(String name,double totalAmount, User giver, List<User> users) {
        EqualExpense expense = new EqualExpense(name, totalAmount, giver, users, new EqualSplitStrategy());
        return expense;
    }
    
}
