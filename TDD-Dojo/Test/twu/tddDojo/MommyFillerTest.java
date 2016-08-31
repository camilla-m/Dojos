package twu.tddDojo;

import org.junit.Assert;
import org.junit.Test;

public class MommyFillerTest {
    @Test
    public void shouldReturnEmptyStringWhenInputIsEmptyString()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("");
        Assert.assertEquals(mommify,"");

    }
    @Test
    public void shouldReturnHWhenInputIsH()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("H");
        Assert.assertEquals(mommify,"H");

    }
    @Test
    public void shouldReturnMommyWhenInputIsA()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("a");
        Assert.assertEquals(mommify,"mommy");

    }
    @Test
    public void shouldReturnHmommyWhenInputIsHa()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("ha");
        Assert.assertEquals(mommify,"hmommy");

    }
    @Test
    public void shouldReturnHmommyhWhenInputIsHah()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("hah");
        Assert.assertEquals(mommify,"hmommyh");

    }
    @Test
    public void shouldReturnHmommyhmommyWhenInputIsHahe()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("hahe");
        Assert.assertEquals(mommify,"hmommyhmommy");

    }
    @Test
    public void shouldReturnMommyWhenInputIsAa()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("aa");
        Assert.assertEquals(mommify,"mommy");

    }

    @Test
    public void shouldReturnMommyhWhenInputIsAaeeh()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("aaeeh");
        Assert.assertEquals(mommify,"mommyh");

    }

    @Test
    public void shouldReturnMommyWhenInputIsAeiou()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("aeiou");
        Assert.assertEquals(mommify,"mommy");

    }
    @Test
    public void shouldReturnHardWhenInputIsHard()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("hard");
        Assert.assertEquals(mommify,"hard");

    }
    @Test
    public void shouldReturnHardhardWhenInputIsHardhard()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("hardhard");
        Assert.assertEquals(mommify,"hardhard");
    }
    @Test
    public void shouldReturnHhhhhWhenInputIsHhhhh()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("hhhhh");
        Assert.assertEquals(mommify,"hhhhh");
    }
    @Test
    public void shouldReturnHmommyrWhenInputIsHear()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("hear");
        Assert.assertEquals(mommify,"hmommyr");
    }
    @Test
    public void shouldReturnMmommymmymommyWhenInputIsMommyaeiou()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("mommyaeiou");
        Assert.assertEquals(mommify,"mmommymmymommy");
    }
    @Test
    public void shouldReturnMmommymmymommyWhenInputIsMommya()  {
        MommyFiller mommyFiller=new MommyFiller();
        String mommify = mommyFiller.mommify("mommya");
        Assert.assertEquals(mommify,"mmommymmymommy");
    }
}
