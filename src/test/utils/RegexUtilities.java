package test.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexUtilities 
{
	
	public static String ApplyRegex(String base, String regex)
	{
		return ApplyRegex(base, regex, 1);
	}
	
	public static String ApplyRegex(String base, String regex, int captureGroup)
	{
		//System.out.println( "Regex " + regex + " on " + base );
		
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(base);
				
		if ( mat.find() )
		{
			return mat.group(captureGroup);
			//base.replaceFirst(pat, "$1");
		}
		
		return null;
	}

	
	public static boolean VerifyPattern(String input, String regexpr)
	{
		Pattern pat = Pattern.compile(regexpr);
		Matcher mat = pat.matcher(input);
		
		return mat.matches();
	}
	
	public static String[] CaptureGroups(String input, String regexpr)
	{
		Pattern pattern = Pattern.compile(regexpr);
		Matcher match = pattern.matcher(input);
		
		if ( ! match.matches() ) return null;
		
		int len = match.groupCount();
		
		String[] result = new String[len];
		
		// "capture groups are from 1 to len"
		for (int i = 0; i < len; i++) 
		{
			result[i] = match.group(i+1);
		}
		
		return result;
	}
}
