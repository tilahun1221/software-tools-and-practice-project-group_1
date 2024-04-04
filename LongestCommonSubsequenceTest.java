

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {

    @Test
    void testFindLCS() {
    	LongestCommonSubsequence lcs = new LongestCommonSubsequence();

        String string1 = "ABCBDAB";
        String string2 = "BDCABA";
        String expectedLCS = "BCBA";
        String actualLCS = lcs.findLCS(string1, string2);
        assertEquals(expectedLCS, actualLCS);

      //Try any test here
    }
}