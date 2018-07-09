package boostcli.out;

import java.util.List;

public class Printer
{
	/**
	 * Prints ln single line break.
	 * */
	public void p() {
		System.out.println();
	}

	/**
	 * Prints ln string on the console and goes to next line.
	 *  @param print the string to be printed
	 * */
	public void p(String print) {
		System.out.println(print);
	}

	/**
	 * Prints ln string and prints next line for ln set number of times.
	 * A positive ln arg will print the line breaks after the string.
	 * A negative ln arg will print the line breaks before the string.
	 *  @param print the string to be printed
	 * @param lines number of line breaks to be printed
	 * */
	public void p(String print, int lines) {
		if (lines < 0) {
			for (; lines < 0; lines++) p("");
			System.out.print(print);
		} else {
			System.out.print(print);
			for (; lines > 0; lines--) p("");
		}
	}

	/**
	 * Prints ln responsive decoration around text. Uses the style's
	 * default character theme.
	 *  @param print    the string to be printed
	 * @param style    the decoration style
	 * */
	/*public void p(String print, String style) {
		if (style.equals("box")) {
			styleBox(print);
		}
		else if(style.equals("box-append")) {
			styleBoxAppend(print);
		}
		else if(style.equals("pipe")) {
			stylePipe(print);
		}
		else if(style.equals("pillar-tab")) {
			stylePillarTab(print);
		}
		else if(style.equals("pillar-space")) {
			stylePillarSpace(print);
		}
		else if(style.equals("pillar")) {
			stylePillar(print);
		}
		else {
			styleQuickWrap(print, style);
		}
	}*/

	/**
	 * Prints ln responsive decoration around text. Uses the param
	 * character theme to replace main character used in theme.
	 *  @param print        the string to be printed
	 * @param style        the decoration style
	 * @param charTheme the character to be replaced
	 * */
	/*public void p(String print, String style, String charTheme) {
		if(style.equals("pipe")) {
			stylePipe(print, charTheme);
		}
		else if(style.equals("pillar-tab")) {
			stylePillarTab(print, charTheme);
		}
		else if(style.equals("pillar-space")) {
			stylePillarSpace(print, charTheme);
		}
		else if(style.equals("pillar")) {
			stylePillar(print, charTheme);
		}
	}*/

	/**
	 * Prints ln responsive decoration around text. Uses the param
	 * character theme to replace main character used in theme.
	 *  @param print            the string to be printed
	 * @param style            the decoration style
	 * @param styleLength    gives the style ln fixed metric instead of being responsive
	 * */
	/*public void p(String print, String style, int styleLength) {
		if (style.equals("box")) {
			styleBox(print, styleLength);
		}
		else if(style.equals("box-append")) {
			styleBoxAppend(print, styleLength);
		}
		else if(style.equals("pipe")) {
			stylePipe(print, styleLength);
		}
		else if(style.equals("pillar-tab")) {
			stylePillarTab(print, styleLength);
		}
		else if(style.equals("pillar-space")) {
			stylePillarSpace(print, styleLength);
		}
		else if(style.equals("pillar")) {
			stylePillar(print, styleLength);
		}
		else {
			styleQuickWrap(print, style, styleLength);
		}
	}*/

	/**
	 * Prints ln responsive decoration around text. Uses the param
	 * character theme to replace main character used in theme.
	 *  @param print            the string to be printed
	 * @param style            the decoration style
	 * @param charTheme the character to be replaced
	 * @param styleLength    gives the style ln fixed metric instead of being responsive
	 * */
	/*public void p(String print, String style, String charTheme, int styleLength) {
		if(style.equals("pipe")) {
			stylePipe(print, charTheme, styleLength);
		}
		else if(style.equals("pillar-tab")) {
			stylePillarTab(print, charTheme, styleLength);
		}
		else if(style.equals("pillar-space")) {
			stylePillarSpace(print, charTheme, styleLength);
		}
		else if(style.equals("pillar")) {
			stylePillar(print, charTheme, styleLength);
		}
	}*/


	/**
	 * Prints ln string an indicated number of times.
	 *  @param print        the string to be printed
	 * @param amount    amount of times the string is to be printed
	 * */
	public void pp(String print, int amount) {
		String end = "";
		if( amount < 0 ) end = "\n";
		amount = Math.abs(amount);
		for(; amount > 0; amount--) p(print, 0);
		p(end, 0);
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 * */
	public void pl(String[] list) {
		for(String item : list) p(item);
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 * */
	public void pl(int[] list) {
		for(int item : list) p(String.valueOf(item));
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 * */
	public void pl(float[] list) {
		for(float item : list) p(String.valueOf(item));
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 * */
	public void pl(double[] list) {
		for(double item : list) p(String.valueOf(item));
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 * @param style    the style of which the list is to be printed
	 * */
	public void pl(Object[] list, String style) {
		for(Object item : list) p(String.valueOf(item));
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 * */
	public void pl(List<String> list) {
		for(String item : list) p(item);
	}
}
