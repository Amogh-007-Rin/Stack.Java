import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class practice {
    
    int option;
    int choice;


    public practice(int option, int choice){
        this.option = option;
        this.choice = choice;

    }
    
    public boolean choose(){
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if( option == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void LearnExceptions(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a vaild number :");
        int choice = sc.nextInt();
        try{
            if(choice >= 1){
                System.out.println("you have choosed 1");
            }
            else{
                System.out.println("you have not choosed 1");
                }
            }
        catch(InputMismatchException e){
                System.err.println("The exception is : " + e);
            }
    }
    
    

    public static void main(String args[]){
        
        practice p = new practice(2, 3);
        p.LearnExceptions();
    }







}
