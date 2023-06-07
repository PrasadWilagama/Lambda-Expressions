package lambda.lab;

import java.util.stream.IntStream;

public class ExampleFirst {

	public static void main(String[] args) {
		loopOldWay();
		System.out.println();
		loopNewWay();
	}

	//old way
	public static void loopOldWay() {

		for (int num = 1; num <= 10; num++) {
			System.out.println("loop old print " + num);
		}
	}

	//using lambda expressions
	public static void loopNewWay() {

		IntStream.iterate(10, num -> num - 1).limit(10).
		forEach(num -> System.out.println("loop new print " + num));
	}
}
