/**
 * Created by thoughtworker on 1/16/14.
 */
public class Player {

    String name;
    private String team;
    private String number;
    private String age;

    public Player(String name){
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
}
