package euler;



/**
 * 
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author teo
 *
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Problem1 problem1 = new Problem1();
		System.out.println(problem1.getSumOfMultiplesBelowX(1000));
	}

	private boolean isMultipleOfThreeOrFive(int number) {
		return ((number % 3) == 0 || (number % 5) == 0);
	}
	
	private int getSumOfMultiplesBelowX(int x) {
		int sum = 0;
		for (int i = 0; i < x; i++) {
			if (isMultipleOfThreeOrFive(i)) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
