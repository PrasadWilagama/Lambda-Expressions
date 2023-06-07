package lambda.lab;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface IAverageServices {

	public int getAverage(List<Integer> listOfMarks);
}

public class Example3 {

	public static void main(String[] args) {

		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(90);
		listOfMarks.add(80);
		listOfMarks.add(70);
		listOfMarks.add(60);
		listOfMarks.add(100);

		IAverageServices iAverageServices =	total -> (listOfMarks.stream().mapToInt(Integer::intValue).sum()) / (listOfMarks.size());

		System.out.println("Average is = " + iAverageServices.getAverage(listOfMarks));
	}
}
