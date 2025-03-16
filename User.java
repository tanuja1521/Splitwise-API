import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String username;
    double balance;
    private List<Expense> expenses;
    private List<Group> groups;

    public User(String name, String email, String username) {
        if(isEmailVaild(email))
        {
            this.name = name;
            this.email = email;
            this.username = username;
            this.balance=0.0;
            this.expenses=new ArrayList<>();
            this.groups=new ArrayList<>();
        }    
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getUsername()
    {
        return this.username;
    }
    public boolean isEmailVaild(String email)
    {
        if(email.contains("@gmail.com"))
            return true;
        else
        {   
            System.out.println("Invalid Email!! Enter correct Email"); 
            return false;
        }    
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        if(isEmailVaild(email))
            this.email=email;                
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public void printExpense()
    {

    }    
    public void updateNewExpense(Expense expense)
    {
        expenses.add(expense);
        printExpense();
        System.out.print("New expense: ");
        System.out.print(expense.getName());
        System.out.print(" added by ");
        System.out.print(expense.getGiver().getName());
    }
}