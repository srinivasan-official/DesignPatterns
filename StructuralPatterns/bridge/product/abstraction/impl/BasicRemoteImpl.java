package bridge.product.abstraction.impl;

import bridge.product.abstraction.Remote;
import bridge.product.implementation.Device;

public class BasicRemoteImpl implements Remote {
	
	private Device device;
	
	public BasicRemoteImpl(Device device) {
		this.device = device;
	}
	
	@Override
	public void togglePower() {
		 System.out.println("Remote: power toggle");
		device.togglePower();
	}

	@Override
	public void volumeUp() {
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume()+1);
	}

	@Override
	public void volumeDown() {
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume()-1);
	}

	@Override
	public void channelUp() {
		System.out.println("Remote: channel up");
		device.setChannelNumber(device.getChannelNumber()+1);
	}

	@Override
	public void channelDown() {
		System.out.println("Remote: channel down");
		device.setChannelNumber(device.getChannelNumber()-1);
	}

}
