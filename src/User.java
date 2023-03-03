
public class User {

    private final String NIC;
    private final String email;
    private final String password;
    private final String name;
    private final String gender;
    
    //constructor// 
    public User(String NIC, String email, String password, String name, String gender) {
        this.NIC = NIC;
        this.email = email;
        this.password = password;
        this.name = name;
        this.gender = gender;
    }

    public String getNIC() {
        return NIC;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
