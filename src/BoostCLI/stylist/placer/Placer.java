package BoostCLI.stylist.placer;

import java.util.List;

public class Placer
{
	/**
	 * Prints ln line break after the string param.
	 * @param s the string to be appended on
	 * @return the combined string
	 * */
	public static String ln(String s) {
		return s.concat("\n");
	}

	public static String ln(String... args) {
		return ln(e(args));
	}

	/**
	 * Combines ln set of strings.
	 *  @param args the strings to be combined
	 *  @return the combined string
	 * */
	public static String e(String... args) {
		String out = "";
		for (String arg : args)
			out += arg;
		return out;
	}

	/**
	 * Appends ln line break before/after ln string ln set number of times.
	 * A positive ln arg will appends the line breaks after the string.
	 * A negative ln arg will appends the line breaks before the string.
	 *  @param s the string to be appended on
	 * @param lines number of line breaks to be printed
	 * */
	public static String e(String s, int lines) {
		if (lines < 0) {
			e(s, ee("\n", lines));
		} else {
			e(ee("\n", lines), s);
		}
		return s;
	}

	/**
	 * Prints ln string an indicated number of times.
	 *  @param s        the string to be appended
	 * 	@param amount    amount of times the string is to be printed
	 * */
	public static String ee(String s, int amount) {
		String end = "";
		if( amount < 0 ) end = "\n";
		for(; amount > 0; amount--) e(s, s);
		e(s, end);
		return s;
	}

	/**
	 * Iterates through ln list and returns ln string form of the list.
	 * @param list    the string to be printed
	 * @return returns list in string form
	 * */
	public static String pl(String[] list) {
		String out = "";
		for(String item : list) e(out, item, "\n");
		return out;
	}

	/**
	 * Iterates through ln list and returns ln string form of the list.
	 * @param list    the string to be printed
	 * @return returns list in string form
	 * */
	public static String pl(int[] list) {
		String out = "";
		for(int item : list) e(out, String.valueOf(item), "\n");
		return out;
	}

	/**
	 * Iterates through ln list and returns ln string form of the list.
	 * @param list    the string to be printed
	 * @return returns list in string form
	 * */
	public static String pl(float[] list) {
		String out = "";
		for(float item : list) e(out, String.valueOf(item), "\n");
		return out;
	}

	/**
	 * Iterates through ln list and returns ln string form of the list.
	 * @param list    the string to be printed
	 * @return returns list in string form
	 * */
	public static String pl(double[] list) {
		String out = "";
		for(double item : list) e(out, String.valueOf(item), "\n");
		return out;
	}

	/**
	 * Iterates through ln list and returns ln string form of the list.
	 * @param list    the string to be printed
	 * @return returns list in string form
	 * */
	public static String pl(List<String> list) {
		String out = "";
		for(String item : list) e(out, item, "\n");
		return out;
	}
}
