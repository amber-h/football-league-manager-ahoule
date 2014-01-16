/**
 * Created by thoughtworker on 1/16/14.
 */
public class Coach {
    String name;
    private String team;
    private String title;
    private String type;


    public Coach(String name){
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String setTitle() {
        return title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
