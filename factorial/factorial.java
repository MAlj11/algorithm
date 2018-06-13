package recursion.factorial;

public class factorial {

	public static int numFactorial(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * numFactorial(n - 1);
		}
	}

	public static void main(String[] args) {
		int numFactorial1 = numFactorial(1);
		int numFactorial2 = numFactorial(2);
		int numFactorial3 = numFactorial(3);
		System.out.print(numFactorial1 + " " + numFactorial2 + " "
				+ numFactorial3);

	}

}
