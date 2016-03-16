import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StopWatchTest {

	@Test
	public void testGetTime() {
		StopWatch s = new StopWatch();
		s.Start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		s.Stop();

		assertEquals(s.getTime() > 0, true);

	}

	@Test
	public void testReset() {
		StopWatch s = new StopWatch();
		s.Start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		s.Stop();

		assertEquals(s.getTime() > 0, true);

		s.reset();

		assertEquals(s.getTime() == 0, true);
	}

	@Test
	public void testTimeFormats() {

		StopWatch s = new StopWatch();
		s.Start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		s.Stop();

		assertTrue(s.getTime() / 1000 == s.getTimeInMicroSec());
		assertTrue(s.getTimeInMicroSec() / 1000 == s.getTimeInMilliSec());
		assertTrue(s.getTimeInMilliSec() / 1000 == s.getTimeInSec());

	}

}
