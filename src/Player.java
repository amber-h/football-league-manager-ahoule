/**
 * Created by thoughtworker on 1/16/14.
 */
public class Player extends LeagueMember{

    String name;
    private String number;
    private String age;


    public Player(String name){
       super(name);
       this.name = name;
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
