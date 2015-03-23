public class Problem5 {

	public static int solveProblem5(int end) {
		boolean done = false;
		int num;
		for (num = 6; !done; num += 6) {
			boolean isDivisible = true;
			for (int div = 4; div <= end; div++) {
				if (num % div != 0) {
					isDivisible = false;
				}
			}
			if (isDivisible) {
				System.out.println(num);
				done = true;
			}

		}

		return num-6;
	}

	public static void main(String[] args) {
		Problem5 solved = new Problem5();
		System.out.println(solved.solveProblem5(Integer.parseInt(args[0])));
		
	}
}

// {
// int i = 20;
// int count = 0;
// while (true) {
// for (int j = 1; j <= 20; j++) {
// if (i % j != 0)
// break;
// else
// count++;
// }
// if (count == 20) {
// System.out.println(i);
// return;
// } else {
// count = 0;
// i++;
// }
// }
// }
// }
// public static void main(String[] args) {
// solveProblem5();
// }
// }

// long smallestDivisibleBy1to20 = 0;
// for (long i = 0; i < 1000000000; i++) {
// if (i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 0
// && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0
// && i % 9 == 0 && i % 10 == 0 && i % 11 == 0 && i % 12 == 0
// && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0
// && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
// smallestDivisibleBy1to20 = i;
// break;
// }
// }
// System.out.println(smallestDivisibleBy1to20);
// return smallestDivisibleBy1to20;
// }
//
// public static void main(String[] args) {
//
// }
