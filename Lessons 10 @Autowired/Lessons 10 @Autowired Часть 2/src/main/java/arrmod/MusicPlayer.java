package arrmod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
    }

    public String playMusic() {
        return "Playing - " + classicalMusic.getSong();
    }
}
