import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by thoughtworker on 1/16/14.
 */
public class leagueManagerTest {
    PrintStream printStream;
    LeagueManager leagueManager;
    List<Player> playerList;
    Player player;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        leagueManager = new LeagueManager();
        playerList = new ArrayList<Player>();
        player = new Player("Bob Joe");
    }

    @Test
    public void shouldListNamesOfPlayersWhenPlayerListIsCalled(){
        playerList.add(player);
        leagueManager.listPlayers(printStream);

        verify(printStream).println("Bob Joe");
    }

    @Test
    public void shouldListTeamOfPlayerWhenPlayerListIsCalled(){
        player.setTeam("Raptors");
        leagueManager.listPlayers(printStream);

        verify(printStream).println("Bob Joe");
        verify(printStream).println("Raptors");
    }

    @Test
    public void shouldListNumberOfPlayerWhenPlayerListIsCalled(){
        player.setNumber("3");
        leagueManager.listPlayers(printStream);

        verify(printStream).println("Bob Joe");
        verify(printStream).println("Raptors");
        verify(printStream).println("3");
    }

    @Test
    public void shouldListAgeOfPlayerWhenPlayerListIsCalled(){
        player.setAge("22");
        leagueManager.listPlayers(printStream);

        verify(printStream).println("Bob Joe");
        verify(printStream).println("Raptors");
        verify(printStream).println("22");
    }

}
