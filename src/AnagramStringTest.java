import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnagramStringTest {
	
AnagramString object = new AnagramString();
@DisplayName("This is anagram checker test")
	@Test
	public void anagramStringTest() {
		boolean expected = true;
		String str1 = "silent";
		String str2 = "listen";
		boolean actual = object.isAnagram(str1, str2);
		Assertions.assertEquals(expected,actual);
	}

}
