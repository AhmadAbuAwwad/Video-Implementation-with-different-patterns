package video_system.codecTypes;

import video_system.videoFile.VideoFile;

public class CodecAdapter {
    private String codecType;
    private VideoFile file;

    public String getCodecType() {
        return codecType;
    }

    public VideoFile getFile() {
        return file;
    }

    /**
     * Adapting the file to its format
     * @param file
     * @return
     */
    public static Codec adaptingFile(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecAdapter: file is a mp4 audio...");
            return new Mp4CodecType();
        }
        else {
            System.out.println("CodecAdapter: file is a mkv audio...");
            return new MkvCodecType();
        }
    }
}
