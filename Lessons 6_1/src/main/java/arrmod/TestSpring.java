package arrmod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "aplicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPalyer musicPalyer = new MusicPalyer(music);

        MusicPalyer musicPalyer = context.getBean("musicPlayer", MusicPalyer.class);
        musicPalyer.playMusic();
        System.out.println(musicPalyer.getName() + " : " + musicPalyer.getVolume());
        context.close();
    }
}