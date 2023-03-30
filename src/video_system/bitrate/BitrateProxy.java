package video_system.bitrate;

import video_system.codecTypes.Codec;
import video_system.videoFile.VideoFile;

public class BitrateProxy {

    /**
     * Reading file within a Proxy
     * @param file
     * @param codec
     * @return
     */
    public static VideoFile reading(VideoFile file, Codec codec) {
        System.out.println("A proxy is checking in Reading the file...");
        VideoFile videoFile = BitrateReader.read(file, codec);
        if (videoFile.getBits().equals("Any thing to be prevented.")){
            System.out.println("Prevented Type");
            return null;
        }

    return videoFile;
    }
    /**
     * Processing file within a Proxy
     * @param file
     * @param codec
     * @return
     */
    public static VideoFile processing(VideoFile file, Codec codec) {
        System.out.println("A proxy is checking in Processing the file...");
        VideoFile videoFile = BitrateReader.process(file, codec);
        if (videoFile.getBits().equals("Any thing to be prevented.")){
            System.out.println("Prevented Type");
            return null;
        }
        return videoFile;
    }
}
