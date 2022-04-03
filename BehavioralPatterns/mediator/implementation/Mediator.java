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
	
	public synchronized void storeMessage(int num) throws Exception {
		while(slotFull) {
			pauseThread();
		}
		slotFull = true;
		notifyAll();
		this.number = num;
	}
	
	public synchronized int retrieveMessage() throws Exception {
		while(!slotFull) {
			pauseThread();
		}
		int curNum = number;
		slotFull = false;
		notifyAll();
		return curNum;
	}
	
	private void pauseThread() throws Exception {
		try {
			wait();
		} catch (InterruptedException e) {
			throw new Exception(Thread.currentThread().getName() + " Execution interrupted");
		}
	}
}
