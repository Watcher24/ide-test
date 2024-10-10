package ch.chm.test.framework.extensions.moon;

import java.util.Date;

public class Moon {

    private Date birthDate;

    protected Moon() {
        this.birthDate = new Date();
    }

    public Date getBirthDate() {
        return birthDate;
    }

}
