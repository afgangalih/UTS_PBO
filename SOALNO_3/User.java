
public class User extends UserProfile {
    public User(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public void logIn(int user_id, String password) {
        if (this.getUser_id() == user_id && this.getPassword().equals(password)) {
            System.out.println("Login successful");
            System.out.println("Welcome " + this.getName());
            System.out.println("Your documents: " + this.getDoc());
        } else {
            System.out.println("Login failed");
        }
    }

    public void recoverPassword() {
        System.out.println("Pemulihan sandi");
    }

    public void logOut() {
        System.out.println("Logout");
    }
}
