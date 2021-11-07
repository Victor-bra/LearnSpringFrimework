package arrmod;

public class MusicPalyer {

    private Music music;

    //Ioc
    public MusicPalyer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing - " + music.getSong());
    }
}
