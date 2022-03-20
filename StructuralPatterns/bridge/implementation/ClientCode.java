package bridge.implementation;

import bridge.product.abstraction.AdvancedRemote;
import bridge.product.abstraction.Remote;
import bridge.product.abstraction.impl.AdvancedRemoteImpl;
import bridge.product.abstraction.impl.BasicRemoteImpl;
import bridge.product.implementation.Device;
import bridge.product.implementation.impl.Radio;
import bridge.product.implementation.impl.Tv;

public class ClientCode {

	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	private static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		Remote remote = new BasicRemoteImpl(device);
		remote.togglePower();
		remote.volumeUp();
		remote.channelUp();
		device.printDeviceStatus();
		
		AdvancedRemote advancedRemote = new AdvancedRemoteImpl(device);
		advancedRemote.togglePower();
		advancedRemote.channelUp();
		advancedRemote.volumeUp();
		advancedRemote.mute();
		device.printDeviceStatus();
	}
}
