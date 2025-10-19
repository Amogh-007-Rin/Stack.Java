// Student Name : Amogh Dath Kalasapura Arunkumar
// Student ID : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk


public class TamagotchiGame {
     private int tiredness;
     private int hunger;
     private int dirtiness;
     private int happiness;
     

    public TamagotchiGame(int tiredness, int hunger, int dirtiness, int happiness){
            this.tiredness = tiredness;
            this.hunger = hunger;
            this.dirtiness = dirtiness;
            this.happiness = happiness;

    }
    
    public void feedTamagotchi(){
        System.out.println("You are feeding the tamagotchi");
        System.out.println("Thank you, Tamagotchi is getting less hungry than before");
        hunger--;
    }

    public void walkTamagotchi(){
        System.out.println("You are taking tamagotchi to a walk");
        System.out.println("Its making tamagotchi happier and also tamagotchi is getting a bit tired");
        happiness++;
        tiredness++;
    }

    public void petTamagotchi(){
        System.out.println("You are petting the tamagotchi");
        System.out.println("Its making tamagotchi happier");
        happiness++;
    }

    public void cleanTamagotchi(){
        System.out.println("You are now cleaning the tamogotchi");
        dirtiness--;
    }

    public void getHappyStatus(){
         // Happiness discription
         if(happiness <= 3){
            System.out.println("Tamagotchi is feeling sad");
            System.out.println("Happiness index of your tamagotchi is : " + happiness);
        }
        else if (happiness >= 7){
            System.out.println("Tamagotchi is very happy");
            System.out.println("Happiness index of your tamagotchi is : " + happiness);
        }
        else if (happiness > 3 && happiness < 7){
            System.out.println("Tamagotchi is in content state");
            System.out.println("Happiness index of your tamagotchi is : " + happiness);
        }
    }

    public void getHungryStatus(){
        // Hunger discription
        if(hunger >= 7){
            System.out.println("Tamagotchi is feeling hungry");
            System.out.println("Please feed your tamagotchi");
            System.out.println("Hunger index of Tamagotchi : " + hunger);
        }
        else{
            System.out.println("Tamagotchi is not feeling hungry");
            System.out.println("Hunger index of Tamagotchi : " + hunger);
        }
    }

    public void getTirednessStatus(){
        // Tiredness discription
        if(tiredness == 10){
            System.out.println("Tamagotchi fell asleep, Because its too tired");
            System.out.println("Tiredness index of Tamagotchi : " + tiredness);
        }
        
        if(tiredness >= 8 && tiredness < 10){
            System.out.println("Tamagotchi is extremly tired, It has to get some rest");
            System.out.println("Tiredness index of Tamagotchi : " + tiredness);
        }
        else{
            System.out.println("Tamagotchi is not tired");
            System.out.println("Tiredness index of Tamagotchi : " + tiredness);
        }
    }

    public void getDirtyStatus(){
        // Dirtyness discription
        if(dirtiness >= 7){
            System.out.println("Tamagotchi is dirty ! , It needs to be cleaned properly");
            System.out.println("Dirtiness index of Tamagotchi is : " + dirtiness);
        }
        else{
            System.out.println("Tamagotchi is in clean condition");
        }
    }

    public void seeTamagotchiCurrentMood(){
        System.out.println("=======YOUR TAMAGOTCHI STATUS========");
        // Happiness Status
        getHappyStatus();
        // Hungry Status
        getHungryStatus();
        // Tiredness Status
        getTirednessStatus();
        // Dirtiness Status
        getDirtyStatus();

    }

    public void leaveTamagotchiAlone(){
        hunger++;
        dirtiness++;
        tiredness++;
        
    }


    public static void main(String args[]){
        TamagotchiGame T1 = new TamagotchiGame(5, 5, 5, 5);
        // Setting initial values of all the parameters of the game as 5
        System.out.println("==================Play with Tamagotchi=====================");
        System.out.println("Option 01 : Feed the Tamagotchi");
        System.out.println("Option 02 : Take Tamagotchi for a Walk");
        System.out.println("Option 03 : Pet Tamagotchi");
        System.out.println("Option 04 : Clean Tamagotchi");
        System.out.println("Option 05 : See Tamagotchi Current mood");
        System.out.println("Option 06 : Leave Tamagotchi alone for a while");
        System.out.println("Option 07 : Exit the Tamagotchi game");

    }
}
