package mediator.implementation;

public class Mediator {
	private boolean slotFull;
	private int number;
	private boolean execute;
	
	public Mediator() {
		this.execute = true;
	}
	
	public boolean getExecutionStatus() {
		return execute;
	}
	
	public void toggleExecution() {
		this.execute = !execute;
	}
	
	public synchronized void storeMessage(int num) {
		while(slotFull) {
			pauseThread();
		}
		slotFull = true;
		notifyAll();
		this.number = num;
	}
	
	public synchronized int retrieveMessage() {
		while(!slotFull) {
			pauseThread();
		}
		int curNum = number;
		slotFull = false;
		notifyAll();
		return curNum;
	}
	
	private void pauseThread() {
		try {
			wait();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
