// StudentName : Amogh Dath Kalasapura Arunkumar
// StudentId : 24168333
// StudentEmail : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

package src;

public class User {
    public final String username;
    public String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean checkPassword(String password){
        boolean response = this.password.equals(password);
        return response;
    }

    public void setPassword(String oldPassword, String newPassword) {
        if(this.checkPassword(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect password; not changed.");
        }
    }
}
