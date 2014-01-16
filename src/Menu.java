import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by thoughtworker on 1/16/14.
 */
public class Menu {
    LeagueManager manager = new LeagueManager();

    public void displayOptions(PrintStream printStream) {
        printStream.println("Please Enter a Number to Choose from the Following Options:");
        printStream.println("1 - List of Players");
        printStream.println("2 - Search for Player");
        printStream.println("3 - List by Team");
    }

    public void executeUserOption(String userOption) throws IOException {
        String[] searchResult = null;
        String nameSearch = "";
        String numberSearch = "";

        if(!isValid(userOption)){
            System.out.println("Please Select a valid option!");
            try {
                executeUserOption(manager.getUserOptionChoice());
            } catch (IOException e) {
                System.out.println("Error Reading Input");
            }
        }
        if(userOption.equals("1")){
            manager.listPlayers(System.out);
        }
        else if(userOption.equals("2")){

            try {
                System.out.println("Please Enter the Name of the Player you are Searching For:");
                nameSearch = manager.getUserOptionChoice();
                System.out.println("Please Enter the Number of the Player you are Searching For:");
                numberSearch = manager.getUserOptionChoice();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Search Results:");
            manager.displaySearchResults(System.out, nameSearch, numberSearch);
        }
    }

    private boolean isValid(String userChoice) {
        ArrayList<String> options = new ArrayList<String>();
        options.add("1");
        options.add("2");
        options.add("3");

        for(String validOption : options)
            if (userChoice.equals(validOption))
                return true;
        return false;
    }

}
