
public class ListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int listSize = 100000;		
		StopWatch s = new StopWatch();
		
		
		
		System.out.println("Creating new list...");
		List<Integer> list = new List<Integer>();
			
		for(int i = listSize - 1; i >= 0; i--){
			list.add(i);
		}
		
		System.out.println("-----------TEST1: FAST------------");
		System.out.println("List sort status: " + list.isSorted());
		System.out.print("Sorting the list...");
		s.Start();
		list.sort();
		s.End();
		System.out.println("Sorted.");		
		System.out.println("Time: " + s.getTimeInMicroSec());
		System.out.println("List sort status: " + list.isSorted());
		

		list = new List<Integer>();
		
		for(int i = listSize - 1; i >= 0; i--){
			list.add(i);
		}
		
		System.out.println("-----------TEST2: SLOW------------");
		
		s.reset();
		System.out.println("List sort status: " + list.isSorted());
		System.out.print("Sorting the list...");
		s.Start();
		list.slowsort();
		s.End();
		System.out.println("Sorted.");		
		System.out.println("Time: " + s.getTimeInMicroSec());
		System.out.println("List sort status: " + list.isSorted());
		
		
		
		
		System.out.println("End of program.");
	
		
		
	}

}
