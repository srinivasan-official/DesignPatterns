package bridge.product.implementation;

public interface Device {
	public boolean isSwitchedOn();
	
	public void togglePower();
	
	public int getVolume();
	
	public void setVolume(int volume);
	
	public int getChannelNumber();
	
	public void setChannelNumber(int channelNumber);
	
	public void printDeviceStatus();
}
