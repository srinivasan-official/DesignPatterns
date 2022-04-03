package mediator.implementation;

public class Consumer implements Runnable {
	private Mediator mediator;
	private int id;
	
	public Consumer(int id, Mediator mediator) {
		this.id = id;
		this.mediator = mediator;
	}
	
	@Override
	public void run() {
		try {
			while(mediator.getExecutionStatus()) {
				int number = mediator.retrieveMessage();
				Buffer.sbf.append("c" + id + " - " + number + "\n");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
