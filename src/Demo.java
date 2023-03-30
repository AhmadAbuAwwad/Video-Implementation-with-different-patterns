import video_system.VideoConverter;

import java.io.File;

public class Demo {
    public static void Starter() {
        //  Start the converter
        VideoConverter converter = new VideoConverter();
        File mp4Video = converter.convertVideo("VIDEO.mkv");
        //  file.play();
    }
}
