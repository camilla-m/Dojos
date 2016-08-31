import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNull;

public class ScoreBoardTest {

    private final String teamAName = "Team A";
    private final String teamBName = "Team B";
    private ScoreBoard scoreBoard;

    @Before
    public void setUp() throws Exception {
        scoreBoard = new ScoreBoard();
        String teamAName = this.teamAName;
        String teamBName = this.teamBName;

        scoreBoard.setTeamAName(teamAName);
        scoreBoard.setTeamBName(teamBName);
    }

    @Test
    public void scoreBoardShouldNotReactWhenNoGoalHappens() throws Exception {
        String goalTeamName = null;

        assertNull(scoreBoard.react(goalTeamName));
    }

    @Test
    public void scoreBoardShouldReactOneToZeroWhenTeamAGoal() throws Exception {

        assertEquals("1:0",scoreBoard.react(this.teamAName));
    }

    @Test
    public void scoreBoardShouldReactTwoToZeroWhenTeamAGotTwoGoal() throws Exception {

        scoreBoard.react(this.teamAName);
        TestCase.assertEquals("2:0",scoreBoard.react(this.teamAName));
    }
}
