package facade.medialibrary.codec;

public enum CodecConstants {
	MPEG4("mp4"), OGG("ogg");
	
	private String codecType;
	
	private CodecConstants(String codecType) {
		this.codecType = codecType;
	}
	
	public String getCodecType() {
		return this.codecType;
	}
}
