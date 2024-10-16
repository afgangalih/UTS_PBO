

public class Admin extends User {
    public Admin(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public void updateVehicleDetails(int vehicle_id) {
        System.out.println("Vehicle details updated for vehicle ID: " + vehicle_id);
    }

    public void addVehicle() {
        System.out.println("New vehicle added.");
    }

    public void retrieveComplain() {
        System.out.println("Retrieving complaints...");
    }

    public void verifyUser(int user_id) {
        if (this.getUser_id() == user_id) {
            System.out.println("User verification successful for user ID: " + user_id);
        } else {
            System.out.println("User verification failed.");
        }
    }
}
