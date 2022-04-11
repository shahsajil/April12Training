import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void compareValueType() {

		String s1 = new String("Tommy");
		String s2 = new String("Tommy");

		boolean result = (s1 == s2);
		System.out.println(result);

		assertEquals(result, false, "Expected is False ");
		;
		;
	}

	@Test
	public void compareReferenceType1() {
		String s1 = new String("Tommy");
		String s2 = new String("Tommy");
		s1 = s2;

		boolean result = (s1 == s2);
		System.out.println(result);

		assertEquals(result, true, "Expected is True");
	}

	@Test
	public void compareReferenceType2() {
		String s1 = new String("Tommy");
		String s2 = new String("Tommy");

		boolean result = s1.equals(s2);
		System.out.println(result);

		assertEquals(result, true, "Expected is True");

	}

	@Test
	public void logicalAndOperator() {
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
	public void logicalOrOperator() {
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
	public void unaryOperator() {
		int a = 5;
		int result;

		System.out.println("Value of a is" + " " + a);
		result = a++;
		System.out.println("After unary postincrement operation the result is" + " " + result);
		result = --a;
		System.out.println("After unary predecrement operation the is" + " " + result);

		assertEquals(result, 5, "Both of this unary operation result value is 5");
	}

	@Test
	public void booleanValue() {
		int a = 15;
		int b = 13;
		boolean c = a > b;
		System.out.println(c);

		assertEquals(c, true, "variable a should be  be greater than varaiable b");
		;

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
	public void ifElseStatements() {
		String language = "Java";
		String bestLanguage = language;
		if (bestLanguage == "Java") {
			System.out.println("Best and hard Programming language");
		} else {
			System.out.println("Other programming languaga");
		}
		assertEquals(bestLanguage, "Java", "Java is a best language");
	}

	@Test
	public void nestedLoopJava() {
		int row = 3;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(j);
			}
			System.out.println("again back to 1st for loop");

		}
		assertEquals(row, 3, "loop should be stop at 3 count");
	}

	@Test
	public void tryCatchBlock() {
		int[] myNumber = { 2, 4, 6, 8 };
		try {

			System.out.println(myNumber[3]);
		} catch (Exception e) {
			System.out.println("Out of sequence");

		}
		assertEquals(myNumber[3], 8, "output should be 8");

	}

	@Test
	public void forEachLoop() {
		int[] numbers = { 0, 1, 2, 3, 5 };

		for (int i = 0; i < numbers.length; ++i) {

			System.out.println(numbers[4]);
		}
		assertEquals(numbers[4], 5, "sequence [4] is 5");
	}

}
