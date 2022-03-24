package facade.medialibrary;

public class VideoFile {
	private String fileName;
	private String codecType;
	
	public VideoFile(String fileName) {
		this.fileName = fileName;
		this.codecType = fileName.substring(fileName.indexOf(".") + 1);
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getCodecType() {
		return codecType;
	}
	
	public void setCodecType(String codecType) {
		this.codecType = codecType;
	}
}
