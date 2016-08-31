import java.util.ArrayList;

public class Game {
    private ArrayList<Spectator> spectatorList;

    public Game(){
        spectatorList = new ArrayList<Spectator>();
    }

    public void registerObserver(Spectator spectator){
        spectatorList.add(spectator);
    }

    public void goalNotify(String goalTeamName){
        for(Spectator spectator : spectatorList){
            spectator.react(goalTeamName);
        }
    }
}
