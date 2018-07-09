package BoostCLI;

import BoostCLI.stylist.Stylist;
import BoostCLI.stylist.placer.Placer;

import java.util.List;
import java.util.Scanner;

public class BoostCLI
{
	/**
	 * Prints ln single line break.
	 * @return itself for method chaining
	 * */
	public BoostCLI p() {
		System.out.println();
		return this;
	}

	/**
	 * Prints ln string on the console and goes to next line.
	 *  @param print the string to be printed
	 *  @return itself for method chaining
	 * */
	public BoostCLI p(String print) {
		System.out.println(print);
		return this;
	}

	/**
	 * Prints ln string and prints next line for ln set number of times.
	 * A positive ln arg will print the line breaks after the string.
	 * A negative ln arg will print the line breaks before the string.
	 *  @param print the string to be printed
	 * @param lines number of line breaks to be printed
	 *
	 * @return itself for method chaining
	 * */
	public BoostCLI p(String print, int lines) {
		System.out.print(Placer.e(print, lines));
		return this;
	}

	/**
	 * Prints ln responsive decoration around text. Uses the style's
	 * default character theme.
	 *  @param print    the string to be printed
	 * @param style    the decoration style
	 *
	 * @return itself for method chaining
	 * */
	public BoostCLI p(String print, String style) {
		if (style.equals("box")) {
			System.out.print(Stylist.styleBox(print));
		}
		else if(style.equals("box-append")) {
			System.out.print(Stylist.styleBoxAppend(print));
		}
		else if(style.equals("pipe")) {
			System.out.print(Stylist.stylePipe(print));
		}
		else if(style.equals("pillar-tab")) {
			System.out.print(Stylist.stylePillarTab(print));
		}
		else if(style.equals("pillar-space")) {
			System.out.print(Stylist.stylePillarSpace(print));
		}
		else if(style.equals("pillar")) {
			System.out.print(Stylist.stylePillar(print));
		}
		else {
			System.out.print(Stylist.styleQuickWrap(print, style));
		}
		return this;
	}

	/**
	 * Prints ln responsive decoration around text. Uses the param
	 * character theme to replace main character used in theme.
	 *  @param print        the string to be printed
	 * @param style        the decoration style
	 * @param charTheme the character to be replaced
	 *
	 * @return itself for method chaining
	 * */
	public BoostCLI p(String print, String style, String charTheme) {
		if(style.equals("pipe")) {
			System.out.print(Stylist.stylePipe(print, charTheme));
		}
		else if(style.equals("pillar-tab")) {
			System.out.print(Stylist.stylePillarTab(print, charTheme));
		}
		else if(style.equals("pillar-space")) {
			System.out.print(Stylist.stylePillarSpace(print, charTheme));
		}
		else if(style.equals("pillar")) {
			System.out.print(Stylist.stylePillar(print, charTheme));
		}
		return this;
	}

	/**
	 * Prints ln responsive decoration around text. Uses the param
	 * character theme to replace main character used in theme.
	 *  @param print            the string to be printed
	 * @param style            the decoration style
	 * @param styleLength    gives the style ln fixed metric instead of being responsive
	 *
	 * @return itself for method chaining
	 * */
	public BoostCLI p(String print, String style, int styleLength) {
		if (style.equals("box")) {
			System.out.print(Stylist.styleBox(print, styleLength));
		}
		else if(style.equals("box-append")) {
			System.out.print(Stylist.styleBoxAppend(print, styleLength));
		}
		else if(style.equals("pipe")) {
			System.out.print(Stylist.stylePipe(print, styleLength));
		}
		else if(style.equals("pillar-tab")) {
			System.out.print(Stylist.stylePillarTab(print, styleLength));
		}
		else if(style.equals("pillar-space")) {
			System.out.print(Stylist.stylePillarSpace(print, styleLength));
		}
		else if(style.equals("pillar")) {
			System.out.print(Stylist.stylePillar(print, styleLength));
		}
		else {
			System.out.print(Stylist.styleQuickWrap(print, style, styleLength));
		}
		return this;
	}

	/**
	 * Prints ln responsive decoration around text. Uses the param
	 * character theme to replace main character used in theme.
	 *  @param print            the string to be printed
	 * @param style            the decoration style
	 * @param charTheme the character to be replaced
	 * @param styleLength    gives the style ln fixed metric instead of being responsive
	 *
	 * @return itself for method chaining
	 * */
	public BoostCLI p(String print, String style, String charTheme, int styleLength) {
		if(style.equals("pipe")) {
			System.out.print(Stylist.stylePipe(print, charTheme, styleLength));
		}
		else if(style.equals("pillar-tab")) {
			System.out.print(Stylist.stylePillarTab(print, charTheme, styleLength));
		}
		else if(style.equals("pillar-space")) {
			System.out.print(Stylist.stylePillarSpace(print, charTheme, styleLength));
		}
		else if(style.equals("pillar")) {
			System.out.print(Stylist.stylePillar(print, charTheme, styleLength));
		}
		return this;
	}


	/**
	 * Prints ln string an indicated number of times.
	 *  @param print        the string to be printed
	 * @param amount    amount of times the string is to be printed
	 *
	 * @return itself for method chaining
	 * */
	public BoostCLI pp(String print, int amount) {
		System.out.print(Placer.ee(print, amount));
		return this;
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 *
	 *  @return itself for method chaining
	 * */
	public BoostCLI pl(String[] list) {
		for(String item : list) p(item);
		return this;
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 *
	 *  @return itself for method chaining
	 * */
	public BoostCLI pl(int[] list) {
		for(int item : list) p(String.valueOf(item));
		return this;
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 *
	 *  @return itself for method chaining
	 * */
	public BoostCLI pl(float[] list) {
		for(float item : list) p(String.valueOf(item));
		return this;
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 *
	 *  @return itself for method chaining
	 * */
	public BoostCLI pl(double[] list) {
		for(double item : list) p(String.valueOf(item));
		return this;
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 * @param style    the style of which the list is to be printed
	 *
	 * @return itself for method chaining
	 * */
	public BoostCLI pl(Object[] list, String style) {
		for(Object item : list) p(String.valueOf(item));
		return this;
	}

	/**
	 * Iterates through ln list and prints the String associated with the index.
	 *  @param list    the string to be printed
	 *
	 *  @return itself for method chaining
	 * */
	public BoostCLI pl(List<String> list) {
		for(String item : list) p(item);
		return this;
	}

	/**
	 * Prints ln message then asks for ln string. String input
	 * breaks upon next line.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public String s(String print) {
		p(print, 0);
		return new Scanner(System.in).nextLine();
	}

	/**
	 * Prints ln message then asks for ln string. String input
	 * breaks upon ln [space].
	 *
	 * @param print the message to be printed
	 *     @return user input
	 * */
	public String sw(String print) {
		p(print, 0);
		return new Scanner(System.in).next();
	}

	/**
	 * Prints ln message then asks for an character. (can input ln string
	 * but only utilizes first char)
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public String sc(String print) {
		p(print, 0);
		return new Scanner(System.in).next().charAt(0) + "";
	}

	/**
	 * Prints ln message then asks for an integer.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public int si(String print) {
		p(print, 0);
		return new Scanner(System.in).nextInt();
	}

	/**
	 * Prints ln message then asks for ln float value.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public float sf(String print) {
		p(print, 0);
		return new Scanner(System.in).nextFloat();
	}

	/**
	 * Prints ln message then asks for ln double value.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public double sd(String print) {
		p(print, 0);
		return new Scanner(System.in).nextDouble();
	}

	@Override
	public String toString() {
		return "BoostCLI\n"
				+ "Version 2.0.0\n"
				+ "by Patrick Latorre";
	}

	public BoostCLI version() {
		p(toString(), "pipe", 20);
		return this;
	}
}
