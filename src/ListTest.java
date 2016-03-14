import static org.junit.Assert.*;

import org.junit.Test;

//import junit.framework.Assert;


public class ListTest {

	@Test
	public void testEnsureCapacity() {
		
		//ensure a list created with size 1 returns 1
		List<Integer> testList = new List<Integer>(1);		
		assertEquals(testList.capacity(), 1);
		
		
		//add two elements, the list size should be 2 now as it doubles
		testList.add(0);
		testList.add(1); 
		assertEquals(testList.capacity(), 2);
		
		
		testList.ensureCapacity(1000);
		assertEquals(testList.capacity(), 1024);
				
	}

	@Test
	public void testSize() {
		List<Integer> testList = new List<Integer>();
		
		for(int i = 0; i < 100; i++){
			testList.add(i);
		}
		
		assertEquals(testList.size(), 100);
	}

	
	
	@Test
	public void testSort() {
		
		List<Integer> testList = new List<Integer>();
		for(int i = 0; i < 100; i++){
			testList.add(i);
		}
		assertEquals(testList.isSorted(), true);
		
		testList = new List<Integer>();
		for(int i = 99; i >= 0; i--){
			testList.add(i);
		}
		assertEquals(testList.isSorted(), false);
		testList.sort();
		assertEquals(testList.isSorted(), true);
		
		
	}

}
