package bridge.product.abstraction.impl;

import bridge.product.abstraction.AdvancedRemote;
import bridge.product.implementation.Device;

public class AdvancedRemoteImpl extends BasicRemoteImpl implements AdvancedRemote {

	private Device device;
	
	public AdvancedRemoteImpl(Device device) {
		super(device);
		this.device = device;
	}
	
	@Override
	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}

}
