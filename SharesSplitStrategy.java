import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharesSplitStrategy implements SplitStrategy{

    @Override
    public Map<User, Double> splitExpense(double totalAmount, List<User> users, Map<User, Double> userSplits) {
        Map<User, Double> shares = new HashMap<>();
        double share = totalAmount / users.size();
        for (User user : users) {
            shares.put(user, share);
        }
        return shares;
    }

}