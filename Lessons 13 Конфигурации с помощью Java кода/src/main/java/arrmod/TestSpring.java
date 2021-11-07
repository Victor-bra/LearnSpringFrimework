package arrmod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);

        System.out.println(classicalMusic1==classicalMusic2);

        RapMusic rapMusic1 = context.getBean("rapMusic", RapMusic.class);
        RapMusic rapMusic2 = context.getBean("rapMusic", RapMusic.class);

        System.out.println(rapMusic1==rapMusic2);
        context.close();
    }
}