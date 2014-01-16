/**
 * Created by thoughtworker on 1/16/14.
 */
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class LeagueManager {
    List<Player> playerList = new ArrayList<Player>();

    public static void run() {
        LeagueManager manager = new LeagueManager();
        Menu menu = new Menu();
        manager.listPlayers(System.out);
        menu.displayOptions(System.out);
    }

    public void listPlayers(PrintStream printStream) {
        Player playerTest = new Player("Bob Joe");
        playerTest.setTeam("Raptors");
        playerTest.setNumber("3");
        playerTest.setAge("22");
        playerList.add(playerTest);

        for(Player player: playerList){
            printStream.println(player.name);
            printStream.println(player.getTeam());
            printStream.println(player.getNumber());
            printStream.println(player.getAge());
        }
    }


}
