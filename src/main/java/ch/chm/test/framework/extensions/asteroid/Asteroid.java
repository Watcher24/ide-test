package ch.chm.test.framework.extensions.asteroid;

import java.util.UUID;

public class Asteroid {

    private String uuid;

    protected Asteroid(){
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }


}
