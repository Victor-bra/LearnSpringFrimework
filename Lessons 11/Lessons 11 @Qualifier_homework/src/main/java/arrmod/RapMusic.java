package arrmod;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{

    private List<String> rapMusic = new ArrayList<>();

    {
        rapMusic.add("1Klass");
        rapMusic.add("Basta");
        rapMusic.add("Kasta");
    }
    @Override
    public List<String> getSong() {
        return rapMusic;
    }
}
