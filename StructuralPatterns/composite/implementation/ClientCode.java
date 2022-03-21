package composite.implementation;

import composite.product.Component;
import composite.product.impl.Directory;
import composite.product.impl.File;

public class ClientCode {
	private StringBuffer sbf;
	
	public ClientCode() {
		this.sbf = new StringBuffer();
	}
	
	public static void main(String[] args) {
		ClientCode clientCode = new ClientCode();
		Component component = clientCode.initialize();
		clientCode.listFilesAndDirectories(component);
	}
	
	public Component initialize() {
		Directory music = new Directory("MUSIC");
        Directory scorpions = new Directory("SCORPIONS");
        Directory dio = new Directory("DIO");
        File track1 = new File("Don't wary, be happy.mp3");
        File track2 = new File("track2.m3u");
        File track3 = new File("Wind of change.mp3");
        File track4 = new File("Big city night.mp3");
        File track5 = new File("Rainbow in the dark.mp3");
        music.addChild(track1);
        music.addChild(scorpions);
        music.addChild(track2);
        scorpions.addChild(track3);
        scorpions.addChild(track4);
        scorpions.addChild(dio);
        dio.addChild(track5);
        return music;
	}
	
	public void listFilesAndDirectories(Component component) {
		component.ls(sbf);
		System.out.println(sbf.toString());
	}

}
