package infiniteMonkeyTheorem;

import java.util.*;

/**
 * The infinite monkey theorem states that a monkey hitting keys at random on a
 * typewriter keyboard for an infinite amount of time will almost surely type a
 * given text, such as the complete works of William Shakespeare.
 * 
 * As such, this program will do several things when run: (1) Prompt the user
 * for a string,(2) Tell the user the probability for a monkey to input that
 * exact string within an infinite length of time
 * 
 * This program assumes the typewriter has 50 keys for the sake of the program,
 * and works upon the premise that if two events are statistically independent,
 * the probability of both happening is the product of the two happening
 * independently. (https://en.wikipedia.org/wili/Infinite_monkey_theorem)
 * 
 * Solution provided by: Ismail A.
 * 
 * @author ieabbas
 */
public class InfiniteMonkeyTheorem {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String phrase;

		System.out.println("Please enter the phrase you want your monkey to type.");
		System.out.println("Note that the monkey has infinite time to type this phrase.");
		System.out.println("Also, there are 50 keys on the typewriter.");
		phrase = kb.nextLine();
		System.out.print("Given an infinite" + "amount of time, the chances of a monkey typing the phrase " + phrase
				+ " is: 1/" + whatAreTheChances(phrase.length()));
	}

	public static int whatAreTheChances(double x) {
		int probability = (int) Math.pow(50, x);
		return probability;
	}

}
