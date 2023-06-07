package lambda.lab;

import java.util.ArrayList;
import java.util.List;

interface IAverageService {

	public int getAverage(List<Integer> listOfMarks);
}

public class Example3Ans implements IAverageService{

	@Override
	public int getAverage(List<Integer> listOfMarks) {
		
		int total = 0;
		for (Integer mark : listOfMarks) {
			total = total + mark;
		}
		return (total/listOfMarks.size());
	}
	
	public static void main(String[] args) {
		
		Example3Ans example3Ans = new Example3Ans();

		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(90);
		listOfMarks.add(80);
		listOfMarks.add(70);
		listOfMarks.add(60);
		listOfMarks.add(100);

		System.out.println("Average is = " + example3Ans.getAverage(listOfMarks));
	}

}
