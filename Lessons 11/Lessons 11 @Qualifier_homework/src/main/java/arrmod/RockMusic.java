package arrmod;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> rockMusic = new ArrayList<>();

    {
        rockMusic.add("Nirvana");
        rockMusic.add("Asking Aleksandria");
        rockMusic.add("Mancore");
    }

    @Override
    public List<String> getSong() {
        return rockMusic;
    }
}
