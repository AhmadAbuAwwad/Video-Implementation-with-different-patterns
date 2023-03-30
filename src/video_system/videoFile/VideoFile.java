package video_system.videoFile;

import java.io.File;

public class VideoFile {
    private String name;
    private String codecType;
    private String bits;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
        this.bits = new File(name).toString();
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
    public String getBits() {
        return bits;
    }
}
