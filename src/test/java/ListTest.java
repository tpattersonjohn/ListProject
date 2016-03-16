import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//import junit.framework.Assert;

public class ListTest {

	@Test
	public void testEnsureCapacity() {

		// ensure a list created with size 1 returns 1
		List<Integer> testList = new List<Integer>(1);
		assertEquals(testList.capacity(), 1);

		// add two elements, the list size should be 2 now as it doubles
		testList.add(0);
		testList.add(1);
		assertEquals(testList.capacity(), 2);

		testList.ensureCapacity(1000);
		assertEquals(testList.capacity(), 1024);

	}

	@Test
	public void testSize() {
		List<Integer> testList = new List<Integer>();

		for (int i = 0; i < 100; i++) {
			testList.add(i);
		}

		assertEquals(testList.size(), 100);
	}

	@Test
	public void isEmpty() {
		List<Integer> testList = new List<Integer>();

		assertTrue(testList.isEmpty());

		testList.add(1);

		assertTrue(!testList.isEmpty());
	}

	@Test
	public void testSort() {

		List<Integer> testList = new List<Integer>();
		for (int i = 0; i < 100; i++) {
			testList.add(i);
		}
		assertEquals(testList.isSorted(), true);

		testList = new List<Integer>();
		for (int i = 99; i >= 0; i--) {
			testList.add(i);
		}
		assertEquals(testList.isSorted(), false);
		testList.sort();
		assertEquals(testList.isSorted(), true);

	}

	@Test
	public void testSlowSort() {
		List<Integer> testList = new List<Integer>();
		for (int i = 0; i < 100; i++) {
			testList.add(i);
		}
		assertEquals(testList.isSorted(), true);

		testList = new List<Integer>();
		for (int i = 99; i >= 0; i--) {
			testList.add(i);
		}
		assertEquals(testList.isSorted(), false);
		testList.slowsort();
		assertEquals(testList.isSorted(), true);

		// Try with size of 1
		testList = new List<Integer>();
		testList.add(1);
		testList.slowsort();
		assertTrue(testList.isSorted());
		int n = testList.get(0);
		assertEquals(n, 1);

	}

	@Test
	public void testGet() {

		List<Integer> testList = new List<Integer>();
		testList.add(1);

		int n = testList.get(0);

		assertEquals(n, 1);

		try {
			testList.get(1);
			assertTrue(false);
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	public int getLinesInString(String s) {
		String NEW_LINE = System.getProperty("line.separator");
		return s.split(NEW_LINE).length;
	}

	@Test
	public void testToString() {
		List<Integer> testList = new List<Integer>();

		testList.add(1);
		String s = testList.toString();

		assertTrue(getLinesInString(s) == 1);

		testList.add(2);
		s = testList.toString();

		assertTrue(getLinesInString(s) == 2);
	}

	@Test
	public void testIsSorted() {
		List<Integer> testList = new List<Integer>();
		testList.add(0);

		assertTrue(testList.isSorted());

		testList.add(1);
		assertTrue(testList.isSorted());

		testList.add(-1);
		assertTrue(!testList.isSorted());
	}

}
