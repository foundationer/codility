package org.mackenzie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {

	public int solution(final int number) {
		String binaryString = Integer.toBinaryString(number);
		Matcher matcher = Pattern.compile("1+(0+)1+").matcher(binaryString);
		if (matcher.find()) {
			return matcher.group(1).length();
		} else {
			return 0;
		}
	}
}
