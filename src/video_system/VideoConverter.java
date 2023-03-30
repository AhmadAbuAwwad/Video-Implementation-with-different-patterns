package video_system;

import video_system.audioMixer.AudioMixer;
import video_system.bitrate.BitrateProxy;
import video_system.codecTypes.Codec;
import video_system.codecTypes.CodecAdapter;
import video_system.videoFile.VideoFile;

import java.io.File;

public class VideoConverter {

    /**
     * Converter Starter for Videos
     * @param fileName
     * @return
     */
    public File convertVideo(String fileName) {
        System.out.println("VideoConverter: conversion started.");

        //  Getting Video File
        VideoFile file = new VideoFile(fileName);

        //  Getting the Type of video file
        Codec destinationCodec = CodecAdapter.adaptingFile(file);

        //  Reading the file by its format
        VideoFile buffer = BitrateProxy.reading(file, destinationCodec);

        //  Processing the file
        VideoFile intermediateResult = BitrateProxy.processing(buffer, destinationCodec);

        //  Fixing Audio
        File result = (new AudioMixer()).fix(intermediateResult);

        //  End Converting
        System.out.println("VideoConverter: conversion completed.");

        return result;
    }
}
