package at.sew.au05;

import java.util.regex.Pattern;

/**
 * v1.0
 * @author Paul Kalauner 3AHIT
 *
 */
public class JGrep {
	/**
	 * @param input
	 * @param pattern
	 * @return output
	 */
	public static String jgrep(String[] input, String pattern) {
		String output = "";
		Pattern p = Pattern.compile(pattern);
		for (String s : input) {
			if (p.matcher(s).find()) {
				output += s + "\n";
			}
		}
		return output;
	}
}