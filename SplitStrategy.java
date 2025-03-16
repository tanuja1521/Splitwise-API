import java.util.List;
import java.util.Map;

public interface SplitStrategy {

    public Map<User, Double> splitExpense(double totalAmount, List<User> users, Map<User, Double> userSplits);
}
