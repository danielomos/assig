package midbreak;

import java.util.ArrayList;

public class MobilePhoneApplication {

    private ArrayList<Users> userList;

    public MobilePhoneApplication() {
        this.userList = new ArrayList<>();
    }

    public ArrayList<Users> getUserList() {
        return userList;
    }


    public Boolean addUser(Users newUser) {;
        if (findPosition(newUser.getName()) >= 0) {
            System.out.println("User already exist");
            return false;
        } else {
            userList.add(newUser);
        }
        System.out.println("User added successfully");
        return true;
    }
    private int findPosition(String name) {
        for (int i = 0; i < userList.size(); i++) {


            if (userList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}