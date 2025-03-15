import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class UserManager {
    private static UserManager instance;
    private static Map<String, User> userList;
    private static Set<String> usernames;

    private UserManager() {
        userList = new HashMap<>();
        usernames = new HashSet<String>();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public static void addUser(User user)
    {
        
        if(user.isEmailVaild(user.getEmail()) && !userExists(user))
        {    
            userList.put(user.getEmail(), user);    
            usernames.add(user.getUsername()); 
        }       
    }

    public static User getUser(String email)
    {
        User user=userList.get(email);
        return user;
    }

    private static boolean userExists(User user) {
        if(userList.containsKey(user.getEmail()))
        {
            System.out.println("Email already exists. Try logging in");
            return false;
        }    
        else if(usernames.contains(user.getUsername()))
        {
            System.out.println("Username already exists. Try other username");
            return false;
        }    
            return true;
    }
}
