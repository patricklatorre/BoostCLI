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
	// TODO: Decide if should break line
	public void p(String print, int lines) {
		if (lines < 0) {
			for (; lines < 0; lines++) p("");
			System.out.println(print);
		} else {
			System.out.print(print);
			for (; lines > 0; lines--) p("");
		}
	}

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
	}

	public void pp(String print, int amount) {
		String end = "";
		if( amount < 0 ) end = "\n";
		amount = Math.abs(amount);
		for(; amount > 0; amount--) p(print, 0);
		p(end, 0);
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
		sc.close();
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
		sc.close();
		return input;
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
		sc.close();
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
		sc.close();
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
		sc.close();
		return input;
	}


	/* PRIVATE METHODS */
	public void styleBox(String s) {
		int width = s.length();
		p("+-", 0);
		for(int i = 0; i < width; i++) p("-", 0);
		p("-+");
		p("| ", 0);
		p(s, 0);
		p(" |");
		p("+-", 0);
		for(int i = 0; i < width; i++) p("-", 0);
		p("-+");
	}

	// TODO: not compatible with stylelength yet
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
		pp(print, print.length());
		p(print);
		pp(print, print.length());
	}

	private void stylePipe(String print, int styleLength) {
		pp(print, styleLength);
		p(print);
		pp(print, styleLength);
	}
}
