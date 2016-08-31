import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReporterTest {
    private Reporter reporter;

    @Before
    public void setUp() throws Exception {
        reporter = new Reporter();

    }

    @Test
    public void shouldReportNothingWhenNoneTeamGoal() throws Exception {
        String goalTeamName = null;

        assertNull(reporter.react(goalTeamName));
    }

    @Test
    public void shouldReportTeamAGotAGoalWhenTeamAGoal() throws Exception {
        String goalTeamName = "Team A";

        assertEquals("Team A got a Goal!",reporter.react(goalTeamName));
    }

    @Test
    public void shouldReportTeamBGotAGoalWhenTeamBGoal() throws Exception {
        String goalTeamName = "Team A";

        assertEquals("Team A got a Goal!",reporter.react(goalTeamName));
    }
}
