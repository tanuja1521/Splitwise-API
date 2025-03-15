import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Group {
    
    private String name;
    private List<User> users;
    private List<Expense> expenses;

    
    public Group(String name)
    {
        this.name=name;
        users = new ArrayList<>();
        expenses = new ArrayList<>();
    }
    public void addUser(User user)
    {
        users.add(user);
    }
    public void removeUser(User user)
    {
        users.remove(user);
    }
    public String getName() {
        return name;
    }
    public List<User> getUsers() {
        return users;
    }
    public List<Expense> getExpenses() {
        return expenses;
    }
    public void addEqualExpense(String groupName, Double totalAmount, User giver, List<User> users)
    {
        ExpenseFactory expenseFactory = new EqualExpenseFactory();
        Expense expense = expenseFactory.createExpense(groupName, totalAmount, giver, users);
        expenses.add(expense);
        notifyNewExpense(expense);
    }
    public void addUnequalSharesExpense(String groupName, Double totalAmount, User giver, List<User> user, Map<User,Double> userSplits)
    {
        ExpenseFactory expenseFactory = new UnequalExpenseFactory();
        Expense expense = expenseFactory.createExpense(groupName, totalAmount, giver, users, userSplits, new SharesSplitStrategy());
        expenses.add(expense);
        notifyNewExpense(expense);
    }
    public void notifyNewExpense(Expense expense)
    {
        List<User> users = expense.getTakers();
         for(User user : users)
         {
            user.updateNewExpense(expense);
         }
    }
}
