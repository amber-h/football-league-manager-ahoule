/**
 * Created by thoughtworker on 1/16/14.
 */
public class LeagueMember {
    String name;
    private String team;

    public LeagueMember(String name){
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
