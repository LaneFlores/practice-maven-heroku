import com.practice.heroku.util.PracticeUtilityClass;
import org.junit.Assert;
import org.junit.Test;

public class TestPracticeUtilityClass {

    @Test public void testMaxLeft() { runTest(2,1,2); }
    @Test public void testMaxRight() { runTest(1,2,2); }
    @Test public void testMaxEqual() { runTest(1,1,1); }

    private void runTest(int x, int y, int expected) {
        Assert.assertEquals(expected, PracticeUtilityClass.max(x,y));
    }
}
