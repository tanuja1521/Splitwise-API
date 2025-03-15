import java.util.List;
import java.util.Map;

public interface ExpenseFactory {
    Expense createExpense(String name, double totalAmount, User giver, List<User> users, Map<User, Double> userSplits, SplitStrategy splitStrategy);
    Expense createExpense(String name, double totalAmount, User giver, List<User> users);
}
