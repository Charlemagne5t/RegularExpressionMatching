import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {


    @Test
    public void isMatchTest1() {
        String s = "aa";
        String p = "a";
        boolean actual = new Solution().isMatch(s, p);
        Assertions.assertFalse(actual);
    }

    @Test
    public void isMatchTest2() {
        String s = "aa";
        String p = "a*";
        boolean actual = new Solution().isMatch(s, p);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isMatchTest3() {
        String s = "ab";
        String p = ".*";
        boolean actual = new Solution().isMatch(s, p);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isMatchTest4() {
        String s = "aab";
        String p = "c*a*b";
        boolean actual = new Solution().isMatch(s, p);
        Assertions.assertTrue(actual);
    }


}
