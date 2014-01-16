import java.io.PrintStream;

/**
 * Created by thoughtworker on 1/16/14.
 */
public class Menu {
    LeagueManager manager = new LeagueManager();

    public void displayOptions(PrintStream printStream) {
        printStream.println("Please Enter a Number to Choose from the Following Options:");
        printStream.println("1 - List of Players");
        printStream.println("2 - Search for Player");
    }

    public void executeUserOption(String userOption){
        if(userOption.equals("1")){
            manager.listPlayers(System.out);
        }
        else if(userOption.equals("2")){
            System.out.println("Please search using the following format: player, number");
            manager.displaySearchResults(System.out, "Bob Joe", "3");
        }
    }
}
