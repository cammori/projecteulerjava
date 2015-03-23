import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Problem1Test {
	int actual;
	int expected;
@Test
public void inputNumber1Receive0 () {
	actual = Problem1.solveProblem1(1);
	expected = 0;
	assertEquals(expected, actual);
}
@Test
public void inputNumber3Receive3 () {
	actual = Problem1.solveProblem1(3);
	expected = 3;
	assertEquals(expected, actual);
}
@Test
public void inputNumber5Receive3 () {
	actual = Problem1.solveProblem1(5);
	expected = 3;
	assertEquals(expected, actual);
}
}

