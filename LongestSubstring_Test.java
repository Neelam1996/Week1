package Week1_Longest_Substring_without_repeat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class LongestSubstring_Test {

	@Test
	void test() {
	
	assertEquals(-1,Longest_Substring_Without_Repeat.lengthOfLongestSubstring(null) );
	assertEquals(12,Longest_Substring_Without_Repeat.lengthOfLongestSubstring("My#name?is Neelam Sharma") );
    	assertEquals(1,Longest_Substring_Without_Repeat.lengthOfLongestSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    	assertEquals(4,Longest_Substring_Without_Repeat.lengthOfLongestSubstring("abcdcba"));
    	assertEquals(5,Longest_Substring_Without_Repeat.lengthOfLongestSubstring("pqrsqpsrt"));
    	assertEquals(4,Longest_Substring_Without_Repeat.lengthOfLongestSubstring("malyalam"));
		
	}

}
