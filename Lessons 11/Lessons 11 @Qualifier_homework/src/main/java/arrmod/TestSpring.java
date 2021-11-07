package arrmod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer music = context.getBean("musicPlayer" , MusicPlayer.class);
        music.playMusic(MusicGenre.CLASSICAL);
        music.playMusic(MusicGenre.RAP);
        music.playMusic(MusicGenre.ROCK);
        context.close();
    }
}