package mediator.implementation;

public class Producer implements Runnable {
	private Mediator mediator;
	private int id;
	private int num;
	
	public Producer(int id, Mediator mediator) {
		this.id = id;
		this.mediator = mediator;
	}

	@Override
	public void run() {
		while(mediator.getExecutionStatus()) {
			num = (int)(Math.random()*100);
			mediator.storeMessage(num);
			Buffer.sbf.append("p" + id + " - " + num + "\n");
		}
	}
}
