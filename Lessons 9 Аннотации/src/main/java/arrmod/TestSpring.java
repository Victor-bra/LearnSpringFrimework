package arrmod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music1 = context.getBean("rapMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music1);
        musicPlayer.playMusic();

        Music music2 = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();
        context.close();
    }
}