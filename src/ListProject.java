
public class ListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int listSize = 10000000;
		
		System.out.println("Creating new list...");
		List<Integer> list = new List<Integer>(listSize);
		
		System.out.println("Current capacity of list: " + list.ensureCapacity(0));
		
		for(int i = listSize - 1; i >= 0; i--){
			list.add(i);
		}
		
		System.out.println("Current elements in list: " + list.size());
		
		
		System.out.println("Sorting the list...");
		list.sort();
		
		System.out.println("End of program.");
	
		
		
	}

}
