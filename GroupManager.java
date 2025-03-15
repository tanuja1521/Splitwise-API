import java.util.HashMap;
import java.util.Map;

class GroupManager {
    private static GroupManager instance;
    private static Map<String, Group> groupList;

    private GroupManager() {
        groupList = new HashMap<>();
    }

    public static GroupManager getInstance() {
        if (instance == null) {
            instance = new GroupManager();
        }
        return instance;
    }

    public static void addgroup(Group group)
    {
        
        if(!groupExists(group))
        {    
            groupList.put(group.getName(), group);    
        }       
    }

    public static Group getgroup(String name)
    {
        if(!groupList.containsKey(name))
        {
            System.out.println("No valid group name");
            return null;
        }
        Group group=groupList.get(name);
        return group;
    }

    private static boolean groupExists(Group group) {
        if(groupList.containsKey(group.getName()))
        {
            System.out.println("Group name already exists. Try other Group name");
            return false;
        }       
        return true;
    }
}
