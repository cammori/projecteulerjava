import static org.junit.Assert.*;

import org.junit.Test;


public class Problem5Test {

	int actual;
	int expected;
//only works for numbers > 6
@Test
public void inputNumber1Receive6 () {
	actual = Problem5.solveProblem5(1);
	expected = 6;
	assertEquals(expected, actual);
}
@Test
public void inputNumber6Receive60 () {
	actual = Problem5.solveProblem5(6);
	expected = 60;
	assertEquals(expected, actual);
}
@Test
public void inputNumber10Receive2520 () {
	actual = Problem5.solveProblem5(10);
	expected = 2520;
	assertEquals(expected, actual);
}
}
