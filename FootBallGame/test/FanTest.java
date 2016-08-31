import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class FanTest {

    private final String TeamAName = "Team A";
    private final String TeamBName = "Team B";
    private Fan fanOfTeamA;
    private Fan fanOfTeamB;

    @Before
    public void setUp() throws Exception {
        fanOfTeamA = new Fan(TeamAName);
        fanOfTeamB = new Fan(TeamBName);
    }

    @Test
    public void fanShouldNotReactWhenNoGoalHappens() throws Exception {
        String goalTeamName = null;

        assertNull(fanOfTeamA.react(goalTeamName));
        assertNull(fanOfTeamB.react(goalTeamName));
    }

    @Test
    public void fanOfTeamAShouldReactHoorayWhenTeamAGotGoal() throws Exception {
        String goalTeamName = TeamAName;

        assertEquals("Hooray",fanOfTeamA.react(goalTeamName));
    }

    @Test
    public void fanOfTeamAShouldReactWoooWhenTeamBGotGoal() throws Exception {
        String goalTeamName = TeamBName;

        assertEquals("Wooo",fanOfTeamA.react(goalTeamName));
    }

    @Test
    public void fanOfTeamAShouldReactHoorayAndFanOfTeamBShouldReactWoooWhenTeamAGotGoal() throws Exception {
        String goalTeamName = TeamAName;

        assertEquals("Hooray",fanOfTeamA.react(goalTeamName));
        assertEquals("Wooo",fanOfTeamB.react(goalTeamName));

    }
}
