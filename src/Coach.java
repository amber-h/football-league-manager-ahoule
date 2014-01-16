/**
 * Created by thoughtworker on 1/16/14.
 */
public class Coach {
    String name;
    private String team;
    private String number;
    private String age;
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

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
