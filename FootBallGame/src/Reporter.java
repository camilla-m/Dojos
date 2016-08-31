/**
 * Created by yanzhang on 8/31/16.
 */
public class Reporter implements Spectator{

    @Override
    public String react(String goalTeamName) {
        if(goalTeamName != null){
            return goalTeamName + " got a Goal!";
        }
        return null;
    }

}
