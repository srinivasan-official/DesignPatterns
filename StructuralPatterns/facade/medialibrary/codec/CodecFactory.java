package facade.medialibrary.codec;

import facade.medialibrary.codec.impl.MPEG4CompressionCodec;
import facade.medialibrary.codec.impl.OggCompressionCodec;

public class CodecFactory {
	
	public static Codec extract(String codecType) throws Exception {
		if(CodecConstants.MPEG4.getCodecType().equals(codecType)) {
			return new MPEG4CompressionCodec();
		} else if(CodecConstants.OGG.getCodecType().equals(codecType)) {
			return new OggCompressionCodec();
		}
		throw new Exception("Unsupported Codec");
	}
	
}
