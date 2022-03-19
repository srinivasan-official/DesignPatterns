package adapter.implementation;

import adapter.adapter.BirdAdapter;
import adapter.adapter.impl.BirdAdapterImpl;
import adapter.product.Bird;
import adapter.product.ToyDuck;
import adapter.product.impl.PlasticToyDuck;
import adapter.product.impl.Sparrow;

public class ClientCode {

	public static void main(String[] args) {
		Bird bird = new Sparrow();
		ToyDuck toyDuck = new PlasticToyDuck();
		
		System.out.println("Sparrow");
		bird.fly();
		bird.makeSound();
		
		System.out.println("\nToyDuck");
		toyDuck.squeak();
		
		BirdAdapter birdAdapter = new BirdAdapterImpl(bird);
		System.out.println("\nBird Adapter");
		birdAdapter.squeak();
	}

}
