package BoostCLI.stylist;

import BoostCLI.stylist.placer.Placer;

public class Stylist
{
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
				+ Placer.ln("+-", Placer.ee("-", width), "-+")
				+ Placer.ln(stylePillar(s, width+2))
				+ Placer.ln("+-", Placer.ee("-", width), "-+");
	}

	public static String styleBox(String s, int styleLength) {
		String paddedString = centerIn(s, styleLength);
		int fullWidth = paddedString.length();
		return ""
				+ Placer.ln("+-", Placer.ee("-", fullWidth), "-+")
				+ Placer.ln(stylePillar(paddedString, styleLength))
				+ Placer.ln("+-", Placer.ee("-", fullWidth), "-+");
	}

	public static String styleBoxAppend(String s) {
		int width = s.length();
		return ""
				+ Placer.ln(stylePillar(s, width+2))
				+ Placer.ln("+-", Placer.ee("-", width), "-+");
	}

	public static String styleBoxAppend(String s, int styleLength) {
		String paddedString = centerIn(s, styleLength);
		int fullWidth = paddedString.length();
		return ""
				+ Placer.ln(stylePillar(paddedString, styleLength))
				+ Placer.ln("+-", Placer.ee("-", fullWidth), "-+");
	}

	public static String stylePipe(String print) {
		return ""
				+ Placer.ln(Placer.ee("=", print.length()))
				+ Placer.ln(print)
				+ Placer.ln(Placer.ee("=", print.length()));
	}

	public static String stylePipe(String print, int styleLength) {
		return ""
				+ Placer.ln(Placer.ee("=", styleLength))
				+ Placer.ln(print)
				+ Placer.ln(Placer.ee("=", styleLength));
	}

	public static String stylePipe(String print, String charTheme) {
		return ""
				+ Placer.ln(Placer.ee(charTheme, print.length()))
				+ Placer.ln(print)
				+ Placer.ln(Placer.ee(charTheme, print.length()));
	}

	public static String stylePipe(String print, String charTheme, int styleLength) {
		return ""
				+ Placer.ln(Placer.ee(charTheme, styleLength))
				+ Placer.ln(print)
				+ Placer.ln(Placer.ee(charTheme, styleLength));
	}

	public static String stylePillarTab(String print) {
		return Placer.e("|\t", print, "|\t");
	}

	public static String stylePillarTab(String print, String charTheme) {
		return Placer.e(charTheme, "\t", print, "\t", charTheme);
	}

	public static String stylePillarTab(String print, int styleLength) {
		return ""
				+ Placer.e("|", Placer.ee("\t", styleLength))
				+ Placer.e(print, 0)
				+ Placer.e(Placer.ee("\t", styleLength), "|");
	}

	public static String stylePillarTab(String print, String charTheme, int styleLength) {
		return ""
				+ Placer.e(charTheme, Placer.ee("\t", styleLength))
				+ Placer.e(print, 0)
				+ Placer.e(Placer.ee("\t", styleLength), charTheme);
	}

	public static String stylePillarSpace(String print) {
		return Placer.e("| ", print, " |");
	}

	public static String stylePillarSpace(String print, String charTheme) {
		return Placer.e(charTheme, " ", print, " ", charTheme);
	}

	public static String stylePillarSpace(String print, int styleLength) {
		String padding = Placer.ee(" ", styleLength);
		return Placer.e("|", padding, print, padding, "|");
	}

	public static String stylePillarSpace(String print, String charTheme, int styleLength) {
		String padding = Placer.ee(" ", styleLength);
		return Placer.e(charTheme, padding, print, padding, charTheme);
	}

	public static String stylePillar(String print) {
		return Placer.e("|", print, "|");
	}

	public static String stylePillar(String print, String charTheme) {
		return Placer.e(charTheme, print, charTheme);
	}

	public static String stylePillar(String print, int styleLength) {
		return Placer.e("|", centerIn(print, styleLength), "|");
	}

	public static String stylePillar(String print, String charTheme, int styleLength) {
		return Placer.e(charTheme, centerIn(print, styleLength), charTheme);
	}

	public static String styleQuickWrap(String print, String wrapper) {
		String[] splitWrap = wrapper.split("[|]");
		return Placer.e(splitWrap[0], print, splitWrap[1]);
	}

	public static String styleQuickWrap(String print, String wrapper, int styleLength) {
		String[] splitWrap = wrapper.split("|");
		String padding = Placer.ee(" ", styleLength);
		return Placer.e(splitWrap[0], padding, print, padding, splitWrap[1]);
	}
}
