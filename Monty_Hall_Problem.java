import java.util.Random;

public class Monty_Hall_Problem{
    public static void main(String[] args){
        int changed_my_mind = 0;
        int not_gonna_change = 0;
        for(int i = 0;i < 1000;i++ ){    // let's play this game 1000 times
            String[] doors = {"goat", "goat", "goat"};
            Random rand = new Random();
            int random = rand.nextInt(3);
            doors[random] = "supercar";   // here we place the car behind a random door
            int choice = rand.nextInt(3);   //here we pick a door
            int revealed;
            do{
                revealed = rand.nextInt(3);
            } while(doors[revealed] == "supercar" || revealed == choice); //here we reveal one of the goats

            if (doors[choice] == "supercar")
                not_gonna_change++;         //here we count number of times we win if we don't change the choice

            if(doors[3 - choice - revealed] == "supercar")
                changed_my_mind++;          //here we count number of times we win if we change the choice
        }
        System.out.println("Changing gave us " + changed_my_mind + " cars.");
        System.out.println("Being stubborn gave us " + not_gonna_change + " cars.");
    }
}