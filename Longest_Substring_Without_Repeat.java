package Week1_Longest_Substring_without_repeat;
import java.util.Scanner;
import org.junit.Assert;
public class Longest_Substring_Without_Repeat {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=s.nextLine();
		System.out.println(lengthOfLongestSubstring(str));

	}
    public static int lengthOfLongestSubstring(String s) {
    	if(s==null) {
    		
    		return -1;
    	}
		int start = 0, curr_Len = 0, max_Len = Integer.MIN_VALUE;
		int characters[] = new int[256];
		int i;
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = (int) ch;

			if (characters[index] != 0 && characters[index] >= start) {
				curr_Len = (i - start);
				start = characters[index];
				max_Len = Math.max(curr_Len, max_Len);
			

			}
			characters[index] = i + 1; // +1 is used because if I have used 0 based indexing then it would not check
										// for 0th index character

		}
		curr_Len = i - start;
    	
		
		return Math.max(curr_Len, max_Len);
    	
	}
  
}
