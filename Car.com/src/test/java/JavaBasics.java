import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class JavaBasics {
	final int ZERO = 0;
	final int ONE = 1;
	final int TWO = 2;
	final boolean TRUE = true;
	final boolean FALSE = false;

	@Test
	public void comparesValueTypeUsingIsEqualToOperator() {

		boolean isContentTheSame = (ONE == TWO);

		assertFalse(isContentTheSame, "content of variables should not be equal.");

	}

	@Test
	public void compareReferenceTypeUsingIsEqualToOperator() {
		String one = new String("Tommy");
		String two = new String("Tommy");

		boolean doesPointToSameLocationMemory = one == two;

		assertFalse(doesPointToSameLocationMemory, "Memory location of variables should not be the same");
	}


	@Test
	public void compareReferenceTypeUsingEqualsMethod() {

		String one = new String("Bobby");
		String two = new String("Bobby");

		boolean doesHaveEqualValue = one.equals(two);

		assertTrue(doesHaveEqualValue, "Contents of variables should be the same.");
	}

	@Test
	public void comparesBooleansUsinglogicalAndOperator() {

		int a = 40;
		int b = 30;
		int c = 30;
		int d = 0;

		if (a > b && c == b) {
			d = a + b + c;
			System.out.println("Pass Condition");

		} else
			System.out.println("False condition");

		assertEquals(d, 100, "The value of d should be 100");

	}

	@Test
	public void comparesBooleansUsinglogicalOrOperator() {

		int a = 40;
		int b = 30;
		int c = 20;
		int d = 10;
		int e = 0;

		if (b < a || c == d) {
			e = a + b + c + d;
			System.out.println("one or both condition is pass");
		} else
			System.out.println("Both condition is false");

		assertEquals(e, 100, "The value of variable e should be 100 ");
	}

	@Test
	public void numbersArePostIncrementedUsingUnaryOperator() {

		int one = 1;
		int expectedValue = 1;

		int result = one++;

		assertEquals(result, expectedValue, "the number should be incremented after getting the value");
	}

	@Test 
	public void numbersArePreDecrementedUsingUnaryOperator() {

		int one = 1;
		int expectedValue = 0;

		int result = --one;

		assertEquals(result, expectedValue, "the number should be decremented before getting the value");		
	}

	@Test
	public void booleanCanBeInversedUsingExclaimationOperator() {

		boolean isTrue = true;

		boolean result = !isTrue;

		assertEquals(result,FALSE, "the boolean should be inversed");
	}

	@Test
	public void ifStatementsJava() {
		int a = 10;
		int b = 22;
		int c = a + b;
		if (a == 10) {
			if (b == 22) {
				System.out.println(c);

			}
		}
		assertEquals(c, 32, "The value should be");

	}

	@Test
	public void canUseMultippleIfElseStatements() {

		boolean isTrue = true;
		boolean isFalse = false;
		boolean didFirstDecisionExecute = false;
		boolean didSecondDecisionExecute = false;

		if(isTrue) {
			didFirstDecisionExecute = true;
		}
		if(isFalse) {
			didSecondDecisionExecute = true;
		}

		assertTrue(didFirstDecisionExecute, "the first decision statement should be executed.");
		assertFalse(didSecondDecisionExecute, "the second decision statement should not be executed.");
	}

	@Test
	public void canUseIfElseStatements() {

		boolean didFirstDecisionExecute = false;
		boolean didSecondDecisionExecute = false;

		if(FALSE) {
			didFirstDecisionExecute = true;
		}
		else {
			didSecondDecisionExecute = true;
		}

		assertFalse(didFirstDecisionExecute, "the first decision statement should be executed.");
		assertTrue(didSecondDecisionExecute, "the second decision statement should not be executed.");

	}

	@Test
	public void canUseNestedForJava() {
		int loopCounter = 0;
		int loopLimit = 5;
		int nestedLoopCounter = 0;
		int nestedLoopLimit = 10;

		int expectedLoopCount = loopLimit;
		int expectedNestedLoopCount = loopLimit * nestedLoopLimit;

		for (int i = 0; i < loopLimit; i++) {
			loopCounter++;

			for (int j = 0; j < nestedLoopLimit; j++) {
				nestedLoopCounter++;
			}
		}
		assertEquals(loopCounter, expectedLoopCount, "outer loop should iterate up to the limit.");
		assertEquals(nestedLoopCounter, expectedNestedLoopCount, "nested loop should iterate to the nested loop limit for each outer loop iteration");
	}

	@Test
	public void canCatchException() {

		boolean doesThrowException = false;

		try {
			throw new UnsupportedOperationException();
		}
		catch (UnsupportedOperationException ex) {
			doesThrowException = true;
		}

		assertTrue(doesThrowException, "the exception should be caught.");
	}

	@Test
	public void canIterateThroughCollectionUsingForEach() {
		List<String> soccerPlayer = new ArrayList<String>();
		List<String> soccers = new ArrayList<String>();
		soccers.add("Messi");
		soccers.add("Ranaldo");
		soccers.add("Maradona");

		for(String soccer:soccers) {
			soccerPlayer.add(soccer);		
		}

		assertEquals(soccerPlayer, soccers, "should iterate through each item in the collection.");
	}

}





