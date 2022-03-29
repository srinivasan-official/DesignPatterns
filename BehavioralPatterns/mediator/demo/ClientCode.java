package mediator.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mediator.implementation.Buffer;
import mediator.implementation.Consumer;
import mediator.implementation.Mediator;
import mediator.implementation.Producer;

public class ClientCode {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Started Producer and Consumer process Press ENTER for exit");
		Mediator mediator = new Mediator();
		List<Thread> threads = new ArrayList<>();
		threads.add(new Thread(new Producer(1, mediator)));
		threads.add(new Thread(new Producer(2, mediator)));
		threads.add(new Thread(new Consumer(1, mediator)));
		threads.add(new Thread(new Consumer(2, mediator)));
		threads.add(new Thread(new Consumer(3, mediator)));
		threads.add(new Thread(new Consumer(4, mediator)));
		for (Thread p : threads) {
			p.start();
		}

		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		mediator.toggleExecution();
		sc.close();
		for (Thread p : threads) {
			System.out.println(p.getState());
		}
		System.out.println(Buffer.sbf.toString());
	}

}
