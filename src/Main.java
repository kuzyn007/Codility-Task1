import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Solution ref = new Solution();
		
		System.out.println(ref.solution(553));
		
		
		in.close();
	}

}

class Solution {
    public int solution(int N) {
		
    	String s = Integer.toString(N);
    	char[] numbers = new char[s.length()];
    	
    	for(int i=0; i<s.length(); i++) {
    		numbers[i] = s.charAt(i);
    	}
    	
    	Arrays.sort(numbers);
    	String reverse = new StringBuilder(new String(numbers)).reverse().toString();
    	
    	int number = Integer.parseInt(reverse);
    	
    	
    	return number;
    }
}