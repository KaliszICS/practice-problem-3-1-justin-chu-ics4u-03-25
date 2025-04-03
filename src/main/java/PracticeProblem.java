public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int x) {
		x = Math.abs(x);

		//base c
		if (x >= 0 && x <= 9) { //if (x / 10 == 0) works too i think
			return x;
		}

		//recursive
		return (x % 10) + sumOfDigits(x / 10);
	}

	public static int factorial(int n) {
		//base c for neg input
		if (n < 0) {
			return 0;
		}

		//base c for factorial of 0
		if (n == 0) {
			return 1;
		}

		//recursive
		return n * factorial(n - 1);
	}

}
