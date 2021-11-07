package arrmod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "aplicationContext.xml");

        ClassicalMusic firstClassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(firstClassicalMusic.getSong());
        ClassicalMusic secondClassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(secondClassicalMusic.getSong());

//        MusicPalyer firstMusicPalyer = context.getBean("musicPlayer", MusicPalyer.class);
//        MusicPalyer secondMusicPalyer = context.getBean("musicPlayer", MusicPalyer.class);
//
//        System.out.println(firstMusicPalyer==secondMusicPalyer);
//
//        System.out.println(firstMusicPalyer);
//        System.out.println(secondMusicPalyer);
//
//        firstMusicPalyer.setVolume(10);
//
//        System.out.println(firstMusicPalyer.getVolume());
//        System.out.println(secondMusicPalyer.getVolume());

        //System.out.println(musicPalyer.getName() + " : " + musicPalyer.getVolume());

        context.close();
    }
}