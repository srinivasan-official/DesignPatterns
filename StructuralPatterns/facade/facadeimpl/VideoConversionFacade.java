package facade.facadeimpl;

import facade.medialibrary.AudioMixer;
import facade.medialibrary.BitrateReader;
import facade.medialibrary.VideoFile;
import facade.medialibrary.codec.Codec;
import facade.medialibrary.codec.CodecFactory;

public class VideoConversionFacade {
	public void convertVideo(String fileName, String format) throws Exception {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file.getCodecType());
        Codec destinationCodec = CodecFactory.extract(format);
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
    }
}
