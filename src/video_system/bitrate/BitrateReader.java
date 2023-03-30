package video_system.bitrate;

import video_system.codecTypes.Codec;
import video_system.videoFile.VideoFile;

public class BitrateReader {

    /**
     * Reading the video file
     * @param file
     * @param codec
     * @return
     */
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    /**
     * Processing the video file
     * @param buffer
     * @param codec
     * @return
     */
    public static VideoFile process(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: processing file...");
        return buffer;
    }
}