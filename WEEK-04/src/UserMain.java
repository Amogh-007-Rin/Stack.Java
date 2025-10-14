package src;

public class UserMain {
    

    public static void main(String args[]){

     User personA = new User("Superman007", "Superman@123");
     System.out.println();
     System.out.println("The username is : " + personA.getUsername());
     System.out.println();
     System.out.println("The password is : " + personA.getPassword());
     System.out.println();
     System.out.println("correct password testing");
     System.out.println(personA.checkPassword("Superman@123"));
     System.out.println("Wrong password testing");
     System.out.println(personA.checkPassword("password"));
     System.out.println();
     System.out.println("Setting a new password");
     personA.setPassword("Superman@123","Batman@123");
     System.out.println();
    
    }
}
