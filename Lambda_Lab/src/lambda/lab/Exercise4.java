package lambda.lab;

import java.util.stream.IntStream;

public class Exercise4 {

	public static void main(String[] args) {

		//Threads old approach
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("Threads Old Way " + i);
				}
			}
		};
		
		new Thread(r1).start();

		//Threads new approach
		//first way
		Runnable r2 = () -> {
			IntStream.iterate(0, i -> i + 1).limit(10).forEach(i -> { System.out.println("Runnable Threads new way 1 : " + i);});
		}; new Thread(r2).start();

		//second way
		new Thread(() -> IntStream.iterate(0, i -> i + 1).limit(10).forEach(i -> { System.out.println("Threads new way 2 : " + i);})).start();
	}
}
