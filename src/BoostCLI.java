import javax.lang.model.type.PrimitiveType;
import java.util.List;
import java.util.Scanner;

public class BoostCLI
{
	Scanner sc;

	public void p() {
		System.out.println();
	}
	/**
	 * Prints a string on the console and goes to next line.
	 *
	 * @param print the string to be printed
	 * */
	public void p(String print) {
		System.out.println(print);
	}

	/**
	 * Prints a string and prints next line for a set number of times.
	 * A positive ln arg will print the line breaks after the string.
	 * A negative ln arg will print the line breaks before the string.
	 *
	 * @param print the string to be printed
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
	 * Prints a responsive decoration around text. Uses the style's
	 * default character theme.
	 *
	 * @param print	the string to be printed
	 * @param style	the decoration style
	 * */
	public void p(String print, String style) {
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
	}

	public void p(String print, String style, String charTheme) {
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
	}

	public void p(String print, String style, int styleLength) {
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
	}

	public void p(String print, String style, String charTheme, int styleLength) {
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
	}



	public void pp(String print, int amount) {
		String end = "";
		if( amount < 0 ) end = "\n";
		amount = Math.abs(amount);
		for(; amount > 0; amount--) p(print, 0);
		p(end, 0);
	}

	public void pl(Object[] list) {
		for(Object item : list) p(String.valueOf(item));
	}

	public void pl(Object[] list, String style) {
		for(Object item : list) p(String.valueOf(item));
	}

	public void pl(List<Object> list) {
		for(Object item : list) p(String.valueOf(item));
	}


	/**
	 * Prints a message then asks for a string. String input
	 * breaks upon next line.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public String s(String print) {
		p(print, 0);
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

	/**
	 * Prints a message then asks for a string. String input
	 * breaks upon a [space].
	 *
	 * @param print the message to be printed
 *     @return user input
	 * */
	public String sw(String print) {
		p(print, 0);
		sc = new Scanner(System.in);
		String input = sc.next();
		return input;
	}

	public String sc(String print) {
		p(print, 0);
		sc = new Scanner(System.in);
		String input = sc.next();
		return "" + input.charAt(0);
	}

	/**
	 * Prints a message then asks for an integer.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public int si(String print) {
		p(print, 0);
		sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

	/**
	 * Prints a message then asks for a float value.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public float sf(String print) {
		p(print, 0);
		sc = new Scanner(System.in);
		float input = sc.nextFloat();
		return input;
	}

	/**
	 * Prints a message then asks for a double value.
	 *
	 * @param print the message to be printed
	 * @return user input
	 * */
	public double sd(String print) {
		p(print, 0);
		sc = new Scanner(System.in);
		double input = sc.nextDouble();
		return input;
	}


	/* PRIVATE METHODS */


	private String replaceInnerSpaces(String print, int slots) {
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

	public void styleBox(String s) {
		int width = s.length();
		p("+-", 0);
		for(int i = 0; i < width; i++) p("-", 0);
		p("-+");
		stylePillar(s, s.length()+2);
		p("+-", 0);
		for(int i = 0; i < width; i++) p("-", 0);
		p("-+");
	}

	/**
	 * @deprecated
	 * */
	public void styleBox(String s, int styleLength) {
		p("+-", 0);
		for(int i = 0; i < styleLength; i++) p("-", 0);
		p("-+");
		p("| ", 0);
		p(s, 0);
		p(" |");
		p("+-", 0);
		for(int i = 0; i < styleLength; i++) p("-", 0);
		p("-+");
	}

	private void styleBoxAppend(String s) {
		int width = s.length();
		p("| ", 0);
		p(s, 0);
		p(" |");
		p("+-", 0);
		for(int i = 0; i < width; i++) p("-", 0);
		p("-+");
	}

	private void styleBoxAppend(String s, int styleLength) {
		p("| ", 0);
		p(s, 0);
		p(" |");
		p("+-", 0);
		for(int i = 0; i < styleLength; i++) p("-", 0);
		p("-+");
	}

	private void stylePipe(String print) {
		pp("=", print.length());
		p();
		p(print);
		pp("=", print.length());
		p();
	}

	private void stylePipe(String print, int styleLength) {
		pp("=", styleLength);
		p();
		p(print);
		pp("=", styleLength);
		p();
	}

	private void stylePipe(String print, String charTheme) {
		pp(charTheme, print.length());
		p();
		p(print);
		pp(charTheme, print.length());
		p();
	}

	private void stylePipe(String print, String charTheme, int styleLength) {
		pp(charTheme, styleLength);
		p();
		p(print);
		pp(charTheme, styleLength);
		p();
	}

	private void stylePillarTab(String print) {
		p("|\t" +print+ "\t|");
	}

	private void stylePillarTab(String print, String charTheme) {
		p(charTheme + "\t" +print+ "\t" + charTheme);
	}

	private void stylePillarTab(String print, int styleLength) {
		p("|", 0);
		for(int i = 0; i < styleLength; i++) p("\t", 0);
		p(print, 0);
		for(int i = 0; i < styleLength; i++) p("\t", 0);
		p("|", 1);
	}

	private void stylePillarTab(String print, String charTheme, int styleLength) {
		p(charTheme, 0);
		for(int i = 0; i < styleLength; i++) p("\t", 0);
		p(print, 0);
		for(int i = 0; i < styleLength; i++) p("\t", 0);
		p(charTheme, 1);
	}

	private void stylePillarSpace(String print) {
		p("| " +print+ " |");
	}

	private void stylePillarSpace(String print, String charTheme) {
		p(charTheme + " " +print+ " " + charTheme);
	}

	private void stylePillarSpace(String print, int styleLength) {
		p("|", 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p(print, 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p("|", 1);
	}

	private void stylePillarSpace(String print, String charTheme, int styleLength) {
		p(charTheme, 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p(print, 0);
		for(int i = 0; i < styleLength; i++) p(" ", 0);
		p(charTheme, 1);
	}

	private void stylePillar(String print) {
		p("|" +print+ "|");
	}

	private void stylePillar(String print, String charTheme) {
		p(charTheme +print+ charTheme);
	}

	private void stylePillar(String print, int styleLength) {
		p("|" +replaceInnerSpaces(print, styleLength)+ "|");
	}

	private void stylePillar(String print, String charTheme, int styleLength) {
		p(charTheme +replaceInnerSpaces(print, styleLength)+ charTheme);
	}
}
