// Student Name : Amogh Dath Kalasapura Arunkumar
// Student ID : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk
// Code starts
import java.util.*;

public class TamagotchiGame {
    // Constants for better maintainability
    private static final int MAX_VALUE = 10;  // --> Max value a instance variable can have.
    private static final int MIN_VALUE = 0;   // --> Minimum values a instance variable should have.
    private static final int HIGH_THRESHOLD = 7; // --> High threashold values of all the instance variables.
    private static final int LOW_THRESHOLD = 3;  // --> Lowest threashold values of all the instance variables.
    private static final int DEFAULT_VALUE = 5;  // --> Default values of all the instance variables at the starting the game.
    
    // Instance variables
    private int tiredness;
    private int hunger;
    private int dirtiness;
    private int happiness;
    
    // Constructor
    public TamagotchiGame(int tiredness, int hunger, int dirtiness, int happiness) {
        this.tiredness = Math.max(Math.min(tiredness, MAX_VALUE), MIN_VALUE);
        this.hunger = Math.max(Math.min(hunger, MAX_VALUE), MIN_VALUE);
        this.dirtiness = Math.max(Math.min(dirtiness, MAX_VALUE), MIN_VALUE);
        this.happiness = Math.max(Math.min(happiness, MAX_VALUE), MIN_VALUE);
    }
    
    // Getter for Tiredness
    public int getTiredness() {
        return tiredness;
    }
    
    // Getter for Hunger
    public int getHunger() {
        return hunger;
    }
    
    // Getter for Dirtiness
    public int getDirtiness() {
        return dirtiness;
    }

    // Getter for Happiness
    public int getHappiness() {
        return happiness;
    }
    
    // SetDefault function to set the Instance variable values to default value if it exceeds the maximum value.
    public void setDefault() {
        // Ensure all values are within bounds --> When the instance values exceeds the maximum instance values i.e > 10;
        tiredness = Math.min(tiredness, MAX_VALUE);
        hunger = Math.min(hunger, MAX_VALUE);
        dirtiness = Math.min(dirtiness, MAX_VALUE);
        happiness = Math.min(happiness, MAX_VALUE);
        
        // Ensures all the values are within bounds --> When the instance values excceds the minimum instance values i.e < 0;
        tiredness = Math.max(tiredness, MIN_VALUE);
        hunger = Math.max(hunger, MIN_VALUE);
        dirtiness = Math.max(dirtiness, MIN_VALUE);
        happiness = Math.max(happiness, MIN_VALUE);
    }
    
    // Function to feed Tamagotchi
    public void feedTamagotchi() {
        System.out.println("You are feeding the tamagotchi");
        if (hunger > MIN_VALUE) {
            hunger--;
        } else {
            hunger = DEFAULT_VALUE;
        }
        System.out.println("Thank you, Tamagotchi is getting less hungry than before");
    }
    
    // Function to walk Tamagotchi
    public void walkTamagotchi() {
        System.out.println("You are taking tamagotchi to a walk");
        System.out.println("It's making tamagotchi happier and also tamagotchi is getting a bit tired");
        happiness = Math.min(happiness + 1, MAX_VALUE);
        tiredness = Math.min(tiredness + 1, MAX_VALUE);
    }
    // Function to pet Tamagotchi
    public void petTamagotchi() {
        System.out.println("You are petting the tamagotchi");
        System.out.println("It's making tamagotchi happier");
        happiness = Math.min(happiness + 1, MAX_VALUE);
    }
    
    // Function to clean Tamagotchi
    public void cleanTamagotchi() {
        System.out.println("You are now cleaning the tamagotchi");
        dirtiness = Math.max(dirtiness - 1, MIN_VALUE);
    }
    
    // FUnction to get HappyStatus of Tamagotchi
    public void getHappyStatus() {
        // Happiness description
        System.out.println("Happiness index of your tamagotchi is : " + happiness);
        if (happiness <= LOW_THRESHOLD) {
            System.out.println("Tamagotchi is feeling sad");
        } else if (happiness >= HIGH_THRESHOLD) {
            System.out.println("Tamagotchi is very happy");
        } else {
            System.out.println("Tamagotchi is in content state");
        }
    }
    
    // Function to get Hungrystatus of Tamagotchi
    public void getHungryStatus() {
        // Hunger description
        System.out.println("Hunger index of Tamagotchi : " + hunger);
        if (hunger >= HIGH_THRESHOLD) {
            System.out.println("Tamagotchi is feeling hungry");
            System.out.println("Please feed your tamagotchi");
        } else {
            System.out.println("Tamagotchi is not feeling hungry");
        }
    }
    
    // Function to get Tiredness Status of Tamagotchi
    public void getTirednessStatus() {
        // Tiredness description
        System.out.println("Tiredness index of Tamagotchi : " + tiredness);
        if (tiredness == MAX_VALUE) {
            System.out.println("Tamagotchi fell asleep, Because it's too tired");
        } else if (tiredness >= 8 && tiredness < MAX_VALUE) {
            System.out.println("Tamagotchi is extremely tired, It has to get some rest");
        } else {
            System.out.println("Tamagotchi is not tired");
        }
    }
    
    // Function to get Dirtiness Status of Tamagotchi
    public void getDirtyStatus() {
        // Dirtiness description
        if (dirtiness >= HIGH_THRESHOLD) {
            System.out.println("Tamagotchi is dirty! It needs to be cleaned properly");
            System.out.println("Dirtiness index of Tamagotchi is : " + dirtiness);
        } else {
            System.out.println("Tamagotchi is in clean condition");
            System.out.println("Dirtiness index of Tamagotchi is : " + dirtiness);
        }
    }
    
    // Function that calls all the status functions and helps to see the current mood of tamagotchi
    public void seeTamagotchiCurrentMood() {
        System.out.println("=======YOUR TAMAGOTCHI STATUS========");
        getHappyStatus();
        getHungryStatus();
        getTirednessStatus();
        getDirtyStatus();
        System.out.println("======================================");
    }
    
    // Pass time function --> Triggers when the tamagotchi is left alone
    public void tamagotchiPassTime() {
        if (tiredness == MAX_VALUE) {
            tiredness = MIN_VALUE;
            System.out.println("Tamagotchi is now fully recharged");
        } else if (tiredness > MIN_VALUE && tiredness < MAX_VALUE) {
            tiredness = Math.min(tiredness + 1, MAX_VALUE);
            System.out.println("Tamagotchi got slightly tired after being alone");
        }
        
        hunger = Math.min(hunger + 1, MAX_VALUE);
        dirtiness = Math.min(dirtiness + 1, MAX_VALUE);
        
        if (hunger >= HIGH_THRESHOLD) {
            happiness = Math.max(happiness - 1, MIN_VALUE);
        }
        if (dirtiness >= HIGH_THRESHOLD) {
            happiness = Math.max(happiness - 1, MIN_VALUE);
        }
    }
    
    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TamagotchiGame tamagotchi = new TamagotchiGame(DEFAULT_VALUE, DEFAULT_VALUE, DEFAULT_VALUE, DEFAULT_VALUE);
        boolean exit = false;
        
        while (!exit) {
            displayMenu();
            
            int option;
            try {
                option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }
            
            switch (option) {
                case 1:
                    tamagotchi.feedTamagotchi();
                    break;
                case 2:
                    tamagotchi.walkTamagotchi();
                    break;
                case 3:
                    tamagotchi.petTamagotchi();
                    break;
                case 4:
                    tamagotchi.cleanTamagotchi();
                    break;
                case 5:
                    tamagotchi.seeTamagotchiCurrentMood();
                    break;
                case 6:
                    tamagotchi.tamagotchiPassTime();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the game! Thank you for playing.");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1-7.");
                    break;
            }
            System.out.println(); // Add spacing between iterations
        }
        sc.close();
    }
    // Static function to display game menu
    private static void displayMenu() {
        System.out.println("==================Play with Tamagotchi=====================");
        System.out.println("Option 01 : Feed the Tamagotchi");
        System.out.println("Option 02 : Take Tamagotchi for a Walk");
        System.out.println("Option 03 : Pet Tamagotchi");
        System.out.println("Option 04 : Clean Tamagotchi");
        System.out.println("Option 05 : See Tamagotchi Current mood");
        System.out.println("Option 06 : Leave Tamagotchi alone for a while");
        System.out.println("Option 07 : Exit the Tamagotchi game");
        System.out.print("Please select an option from (01 - 07): ");
    }
}
// Code Ends