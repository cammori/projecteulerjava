public class Problem1 {

	public static int solveProblem1(int userInput) {
		int sumOfMultiples = 0;
		for (int i = 0; i < userInput; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sumOfMultiples += i;
			}
		}
		System.out.println(sumOfMultiples);
		return sumOfMultiples;
	}

	public static void main(String[] args) {
		solveProblem1(Integer.parseInt(args[0]));
		
	}
}
