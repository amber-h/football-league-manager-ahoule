/**
 * Created by thoughtworker on 1/16/14.
 */
public class Coach extends LeagueMember {
    String name;
    private String title;

    public Coach(String name){
        super(name);
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String setTitle() {
        return title;
    }

}
