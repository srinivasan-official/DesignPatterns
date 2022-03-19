package adapter.adapter.impl;

import adapter.adapter.BirdAdapter;
import adapter.product.Bird;

public class BirdAdapterImpl implements BirdAdapter {
	private Bird bird;
	
	public BirdAdapterImpl(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void squeak() {
		bird.makeSound();
	}

}
