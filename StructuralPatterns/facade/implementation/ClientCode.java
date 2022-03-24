package facade.implementation;

import facade.facadeimpl.VideoConversionFacade;

public class ClientCode {
	
	public static void main(String[] args) throws Exception {
		VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");
	}
	
}
