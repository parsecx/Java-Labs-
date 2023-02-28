package ChapterOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathProblems {
	
	public static int calc(int m, int n) {
		return (n * m / 2 ) %  7;
	}
	
	public static void calcSumAndCountAllNumbersDivBy_2_Or_7(int n) {
		int dividers = 0, count = 0;
		for(int i = 2; i < n; i += 2) {
			dividers += i;
			count++;
		}
		for(int i = 7; i < n ; i += 7 ) {
			dividers += i;
			count++;
		}
		System.out.print("Result count:" + count + " Sum:" + dividers);
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0 ? true : false;
	}
	
	public static boolean isOdd(int n) {
		return n % 2 != 0 ? true : false;
	}
	
	public static String numberAsText(int n) {
		List<Integer> numbersOfText = new ArrayList<Integer>();
		String result = "";
		while(n != 0) {
			numbersOfText.add((Integer)n % 10);
			n /= 10;
		}
		Collections.reverse(numbersOfText);
		for(Integer i : numbersOfText) {
			switch(i) {
				case 0: result.concat("ZERO"); break;
				case 1: result.concat("ONE"); break;
				case 2: result.concat("TWO"); break;
				case 3: result.concat("THREE"); break;
				case 4: result.concat("FOUR"); break;
				case 5: result.concat("FIVE"); break;
				case 6: result.concat("SIX"); break;
				case 7: result.concat("SEVEN"); break;
				case 8: result.concat("EIGHT"); break;
				case 9: result.concat("NINE"); break;
			}
		}
		return result;
	}
}
