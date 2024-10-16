

public class Main {
    public static void main(String[] args) {
        // buatt objek UserProfile
        UserProfile userProfile = new UserProfile(1, "password123", "paraja", 30, "pararaja@gmail.com", "document.jpg");
        System.out.println("Nama UserProfile: " + userProfile.getName());
        userProfile.showDocuments();
        System.out.println("");

        // buat objek User
        User user = new User(1, "password123", "Asep", 25, "asep@gmail.com.com", "document.pdf");
        user.logIn(1, "password123");  // login pake password yang benar
        System.out.println("");
        user.logOut();
        user.showDocuments();
        System.out.println("");

        // Membuat objek Customer
        Customer customer = new Customer(3, "password789", "rojak", 28, "rojak@gmail.com", "document.png");
        System.out.println("Status Verifikasi: " + customer.getVerStatus());
        customer.applyVerification("verified_doc.pdf");
        System.out.println("Status Verifikasi setelah verifikasi: " + customer.getVerStatus());
        System.out.println("");

        // buat objek Admin
        Admin admin = new Admin(4, "password000", "kartono", 35, "kartono@gmail.com", "admin_doc.pdf");
        admin.verifyUser(4);  //verifikasi admin berdasarkan user_id
        admin.updateVehicleDetails(12345);  
        admin.addVehicle();  
        admin.retrieveComplain();  
    }
}
