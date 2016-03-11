
public class StopWatch {

	private long startTime;
	private long endTime;
	
	public StopWatch(){
		reset();
	}
	
	public void Start(){
		startTime = System.nanoTime();
	}
	
	public void End(){
		endTime = System.nanoTime();
	}
	
	public long getTime(){
		return endTime - startTime;
	}
	
	public void reset(){
		startTime = 0;
		endTime = 0;
	}
	
	
	
}
