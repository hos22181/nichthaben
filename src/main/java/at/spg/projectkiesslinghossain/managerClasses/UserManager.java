package at.spg.projectkiesslinghossain.managerClasses;

public class UserManager {
 /*   List<User> users;

    public boolean registerUser(String username, String password, String email, String firstname, String lastname, String phonenumber, String address) {
        if (isUsernameTaken(username) || isEmailTaken(email)) {
            return false;
        }
        User user = new User();
        user.userId = users.size();
        user.username = username;
        user.hashedPassword = hashPass(password);
        user.firstName = firstname;
        user.lastName = lastname;
        user.registrationDate = LocalDate.now();
        user.phoneNumber = phonenumber;
        user.email = email;

        return users.add(user);
    }

    public boolean loginUser(String username, String password) {
        String hashedPassword = hashPass(password);
        User user = getUserByUsername(username);
        if (user != null) {
            return hashedPassword.equals(user.hashedPassword);
        }
        return false;
    }

    public boolean changeUserName(String username, String newName, String password){
        String pass = hashPass(password);
        User user = getUserByUsername(username);
        if (user != null) {
            if (pass.equals(user.hashedPassword)) {
                user.username=newName;
                return true;
            }
        }
        return false;
    }

    public boolean changeUserPassword(String username, String newPassword, String password){
        String pass = hashPass(password);
        User user = getUserByUsername(username);
        if (user != null) {
            if (pass.equals(user.hashedPassword)) {
                user.hashedPassword = hashPass(newPassword);
                return true;
            }
        }
        return false;
    }


    protected String hashPass(String password) {
        return password + "123";
    }

    private boolean isUsernameTaken(String username) {
        return users.stream().anyMatch(user -> user.username.equals(username));
    }

    private boolean isEmailTaken(String email) {
        return users.stream().anyMatch(user -> user.email.equals(email));
    }

    private User getUserByUsername(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return user;
            }
        }
        return null;
    }



*/
}