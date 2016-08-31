
public class Fan {
    private String supportTeamName;
    public Fan(String supportTeamName) {
        this.supportTeamName = supportTeamName;
    }

    public String react(String goalTeamName) {
        return goalTeamName != null ? goalTeamName.equals(supportTeamName) ? "Hooray" : "Wooo" : goalTeamName;
    }
}
