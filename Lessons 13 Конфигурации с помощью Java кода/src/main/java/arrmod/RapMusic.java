package arrmod;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class RapMusic implements Music{

    @Override
    public String getSong() {
        return "1Klass";
    }
}
