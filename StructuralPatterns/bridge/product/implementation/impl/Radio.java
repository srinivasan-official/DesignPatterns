package bridge.product.implementation.impl;

import bridge.product.implementation.Device;

public class Radio implements Device {

	private boolean power;
	
	private int volume;
	
	private int channelNumber;
	
	private static final int MAX_CHANNEL_NUMBERS_SUPPORTED = 31;
	
	@Override
	public boolean isSwitchedOn() {
		return power;
	}

	@Override
	public void togglePower() {
		this.power = !this.power;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if(SupportedVolume.VOLUME_MAX.getVolume()>volume || SupportedVolume.VOLUME_MIN.getVolume()<volume) 
			return;
		this.volume = volume;
	}

	@Override
	public int getChannelNumber() {
		return channelNumber;
	}

	@Override
	public void setChannelNumber(int channelNumber) {
		this.channelNumber = channelNumber % MAX_CHANNEL_NUMBERS_SUPPORTED;
	}

	@Override
	public void printDeviceStatus() {
		System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (power ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channelNumber);
        System.out.println("------------------------------------\n");
	}
	
	enum SupportedVolume {
		VOLUME_MAX(150), VOLUME_MIN(0);
		
		private int volume;
		
		private SupportedVolume(int volume) {
			this.volume = volume;
		}
		
		public int getVolume() {
			return this.volume;
		}
	}

}
