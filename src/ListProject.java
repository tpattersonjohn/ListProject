
public class ListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Creating new list...");
		List<Integer> list = new List<Integer>();
		
		System.out.println("Current capacity of list: " + list.ensureCapacity(0));
		
		for(int i = 0; i < 10000; i++){
			list.add(i);
		}
		
		System.out.println("Current elements in list: " + list.size());
		System.out.println("Current capacity of list: " + list.ensureCapacity(0));
		
		System.out.println("End of program.");
	
		
		
	}

}
