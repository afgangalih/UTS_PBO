
public class Customer extends User {
    private boolean ver_status = false;

    public Customer(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public boolean getVerStatus() {
        return ver_status;
    }

    public void applyVerification(String doc) {
        System.out.println("Verification Successful with doc: " + doc);
        this.ver_status = true; // Status verifikasi diubah menjadi true
    }
}
