package boostcli.decorator;

import boostcli.decorator.appendor.Appender;

public class Decorator
{
	private Appender a = new Appender();

	public static String centerIn(String print, int slots) {
		String modifiedStr = "";
		int padding = (slots-print.length()) / 2;

		for(int i = 0; i < padding; i++)
			modifiedStr += " ";
		modifiedStr += print;
		for(int i = 0; i < padding; i++)
			modifiedStr += " ";

		if((slots - print.length()) % 2 != 0)
			modifiedStr += " ";

		return modifiedStr;
	}

	public static String styleBox(String s) {
		int width = s.length();
		return ""
				+ Appender.ln("+-", Appender.aa("-", width), "-+")
				+ Appender.ln(stylePillar(s, width+2))
				+ Appender.ln("+-", Appender.aa("-", width), "-+");
	}

	public static String styleBox(String s, int styleLength) {
		String paddedString = centerIn(s, styleLength);
		int fullWidth = paddedString.length();
		return ""
				+ Appender.ln("+-", Appender.aa("-", fullWidth), "-+")
				+ Appender.ln(stylePillar(paddedString, styleLength))
				+ Appender.ln("+-", Appender.aa("-", fullWidth), "-+");
	}

	public static String styleBoxAppend(String s) {
		int width = s.length();
		return ""
				+ Appender.ln(stylePillar(s, width+2))
				+ Appender.ln("+-", Appender.aa("-", width), "-+");
	}

	public static String styleBoxAppend(String s, int styleLength) {
		String paddedString = centerIn(s, styleLength);
		int fullWidth = paddedString.length();
		return ""
				+ Appender.ln(stylePillar(paddedString, styleLength))
				+ Appender.ln("+-", Appender.aa("-", fullWidth), "-+");
	}

	public static String stylePipe(String print) {
		return ""
				+ Appender.ln(Appender.aa("=", print.length()))
				+ Appender.ln(print)
				+ Appender.ln(Appender.aa("=", print.length()));
	}

	public static String stylePipe(String print, int styleLength) {
		return ""
				+ Appender.ln(Appender.aa("=", styleLength))
				+ Appender.ln(print)
				+ Appender.ln(Appender.aa("=", styleLength));
	}

	public static String stylePipe(String print, String charTheme) {
		return ""
				+ Appender.ln(Appender.aa(charTheme, print.length()))
				+ Appender.ln(print)
				+ Appender.ln(Appender.aa(charTheme, print.length()));
	}

	public static String stylePipe(String print, String charTheme, int styleLength) {
		return ""
				+ Appender.ln(Appender.aa(charTheme, styleLength))
				+ Appender.ln(print)
				+ Appender.ln(Appender.aa(charTheme, styleLength));
	}

	public static String stylePillarTab(String print) {
		return Appender.a("|\t", print, "|\t");
	}

	public static String stylePillarTab(String print, String charTheme) {
		return Appender.a(charTheme, "\t", print, "\t", charTheme);
	}

	public static String stylePillarTab(String print, int styleLength) {
		return ""
				+ Appender.a("|", Appender.aa("\t", styleLength))
				+ Appender.a(print, 0)
				+ Appender.a(Appender.aa("\t", styleLength), "|");
	}

	public static String stylePillarTab(String print, String charTheme, int styleLength) {
		return ""
				+ Appender.a(charTheme, Appender.aa("\t", styleLength))
				+ Appender.a(print, 0)
				+ Appender.a(Appender.aa("\t", styleLength), charTheme);
	}

	public static String stylePillarSpace(String print) {
		return Appender.a("| ", print, " |");
	}

	public static void stylePillarSpace(String print, String charTheme) {
		
		p(charTheme + " " +print+ " " + charTheme);
	}

	public static void stylePillarSpace(String print, int styleLength) {
		p("|", 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p(print, 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p("|", 1);
	}

	public static void stylePillarSpace(String print, String charTheme, int styleLength) {
		p(charTheme, 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p(print, 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p(charTheme, 1);
	}

	public static void stylePillar(String print) {
		p("|" +print+ "|");
	}

	public static void stylePillar(String print, String charTheme) {
		p(charTheme +print+ charTheme);
	}

	public static String stylePillar(String print, int styleLength) {
		return Appender.a("|", centerIn(print, styleLength), "|");
	}

	public static void stylePillar(String print, String charTheme, int styleLength) {
		p(charTheme + centerIn(print, styleLength)+ charTheme);
	}

	public static void styleQuickWrap(String print, String wrapper) {
		String[] splitWrap = wrapper.split("[|]");
		p(splitWrap[0] +print+ splitWrap[1], 0);
	}

	public static void styleQuickWrap(String print, String wrapper, int styleLength) {
		String[] splitWrap = wrapper.split("|");

		p(splitWrap[0], 0);
		for(int i = 0; i < styleLength; i++)
			p(" ", 0);
		p(print, 0);
		for(int i = 0; i < styleLength; i++)
			p(" ", 0);
		p(splitWrap[1], 0);
	}
}
