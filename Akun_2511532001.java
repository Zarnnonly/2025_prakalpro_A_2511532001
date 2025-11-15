package pekan7_2511532001;

public class Akun_2511532001 { 
    private String username, password, email;
    private int pinAngka;
    
    // Setter
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPinAngka(int pinAngka) {
        this.pinAngka = pinAngka;
    }
    
    // Getter
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getPinAngka() {
        return pinAngka;
    }
    
    public boolean isPasswordValid() {
        return password != null
                && !password.trim().isEmpty()
                && password.length() >= 8;
    }
    
    public boolean isEmailValid() {
        return email != null
                && !email.trim().isEmpty()
                && email.contains("@")
                && email.contains(".");
    }
}
