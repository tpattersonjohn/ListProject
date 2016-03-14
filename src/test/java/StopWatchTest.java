package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.StopWatch;

public class StopWatchTest {

	@Test
	public void testGetTime() {
		StopWatch s = new StopWatch();
		s.Start();

		for (int i = 0; i < 10000; i++) {
			int j = 0;
		}

		s.Stop();

		assertEquals(s.getTime() > 0, true);

	}

	@Test
	public void testReset() {
		StopWatch s = new StopWatch();
		s.Start();

		for (int i = 0; i < 10000; i++) {
			int j = 0;
		}

		s.Stop();

		assertEquals(s.getTime() > 0, true);

		s.reset();

		assertEquals(s.getTime() == 0, true);
	}

}
