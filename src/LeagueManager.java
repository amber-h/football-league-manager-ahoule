/**
 * Created by thoughtworker on 1/16/14.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class LeagueManager {
    List<LeagueMember> playerList = new ArrayList<LeagueMember>();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintStream printStream = System.out;

    public void run() {
        Menu menu = new Menu();
        listPlayers(System.out);
        menu.displayOptions(System.out);
        try {
            menu.executeUserOption(getUserOptionChoice());
        } catch (IOException e) {
            System.out.println("Error Reading Input");
        }
    }

    public void listPlayers(PrintStream printStream) {
        populatePlayerList();

        printStream.println("List of Players:");

        for(LeagueMember member: playerList){
            Player player = (Player) member;
            printStream.println(player.name);
            printStream.println(player.getTeam());
            printStream.println(player.getNumber());
            printStream.println(player.getAge());
        }
    }

    public String getUserOptionChoice() throws IOException {
        return bufferedReader.readLine();
    }

    public void displaySearchResults(PrintStream printStream, String nameSearch, String numberSearch) {
        populatePlayerList();
        for(LeagueMember member: playerList){
            Player player = (Player) member;
            if(player.name.equals(nameSearch) && player.getNumber().equals(numberSearch)){
            printStream.println(player.name);
            printStream.println(player.getTeam());
            printStream.println(player.getNumber());
            printStream.println(player.getAge());
            }
        }
    }

    public void searchByTeam(PrintStream printStream, String teamSearch){
        populatePlayerList();
        for(LeagueMember member: playerList){
            Player player = (Player) member;
            if(player.getTeam().equals(teamSearch)){
                printStream.println(player.name);
                printStream.println(player.getTeam());
                printStream.println(player.getNumber());
                printStream.println(player.getAge());
            }
        }
    }

    private void populatePlayerList() {
        Player playerTest = new Player("Bob Joe");
        playerTest.setTeam("Raptors");
        playerTest.setNumber("3");
        playerTest.setAge("22");

        Player playerTest2 = new Player("Bob Bill");
        playerTest2.setTeam("Lakers");
        playerTest2.setNumber("12");
        playerTest2.setAge("33");

        Coach coachTest = new Coach("Bob Alice");
        coachTest.setTeam("Raptors");
        coachTest.setTitle("Head Coach");

        playerList.add(playerTest);
        playerList.add(playerTest2);
        //playerList.add(coachTest);
    }
}
