package arrmod;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> classicalMusic = new ArrayList<>();

    {
        classicalMusic.add("Bethoven");
        classicalMusic.add("Buch");
        classicalMusic.add("Mocart");
    }

    @Override
    public List<String> getSong() {
        return classicalMusic;
    }
}
