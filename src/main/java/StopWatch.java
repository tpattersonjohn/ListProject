package main.java;

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
	
	//returns in ms
	public long getTime(){
		return endTime - startTime;
	}
	
	public long getTimeInMicroSec(){
		return getTime() / 1000;
	}
	
	public long getTimeInMilliSec(){
		return getTime() / 1000000;
	}
	
	public long getTimeInSec(){
		return getTime() / 1000000000;
	}
	
	public void reset(){
		startTime = 0;
		endTime = 0;
	}
	
	
	
}
