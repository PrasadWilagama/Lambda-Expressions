package lambda.lab;
import java.util.ArrayList;
import java.util.List;

interface ICalculateService{
	
	public int calculateTotal(List<Integer> listOfMarks);
	
}

public class Example2 implements ICalculateService{
	
	@Override
	public int calculateTotal(List<Integer> listOfMarks) {
		
		int total = 0;
		for (Integer mark : listOfMarks) {
			total = total + mark;
		}
		return total;
	}

	public static void main(String[] args) {
		
		Example2 example2 = new Example2();
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(85);
		listOfMarks.add(75);
		listOfMarks.add(60);
		listOfMarks.add(80);
		listOfMarks.add(100);
		
		int total = example2.calculateTotal(listOfMarks);
		System.out.println("Total is = " + total);
	}
}
