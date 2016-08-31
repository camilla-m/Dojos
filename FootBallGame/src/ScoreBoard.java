
public class ScoreBoard {
    private String teamAName;
    private String teamBName;

    private int teamAScore;
    private int teamBScore;

    public ScoreBoard() {
        teamAScore = 0;
        teamBScore = 0;
    }

    public void setTeamAName(String teamAName) {
        this.teamAName = teamAName;
    }

    public void setTeamBName(String teamBName) {
        this.teamBName = teamBName;
    }

    public String react(String goalTeamName) {
        if(goalTeamName.equals(teamAName)){
            teamAScore += 1;
        }
        else if(goalTeamName.equals(teamBName)){
            teamBScore += 1;
        }
        return goalTeamName != null ? scoreToString() : goalTeamName;
    }

    private String scoreToString() {
        return teamAScore + ":" + teamBScore;
    }
}
