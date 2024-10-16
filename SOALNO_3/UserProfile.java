

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc; // .jpg, .png, .pdf

    // Constructor
    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    // Getter untuk setiap atribut
    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getDoc() {
        return doc;
    }

    // Metode untuk mengedit profil
    public void editProfile(String name, int age, String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
    }

    // Metode untuk menampilkan dokumen
    public void showDocuments() {
        System.out.println("Showing document: " + doc);
    }
}
