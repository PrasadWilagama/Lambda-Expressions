package lambda.lab;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface ICalculateServices{
	
	public int calculateTotal(List<Integer> listOfMarks);
	
}

public class Example2Ans{

	public static void main(String[] args) {
		
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(85);
		listOfMarks.add(75);
		listOfMarks.add(60);
		listOfMarks.add(80);
		listOfMarks.add(100);
		
		ICalculateService iCalculateService = total -> listOfMarks.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("Total is = " + iCalculateService.calculateTotal(listOfMarks));
	}
}
