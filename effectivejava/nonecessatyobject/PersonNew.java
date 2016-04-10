package effectivejava.mutiparamsconstructor.nonecessatyobject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by licheng on 10/4/16.
 */
public class PersonNew {
    private final Date birthDate;

    private static Date BOOM_START = null;
    private static Date BOOM_END = null;

    public PersonNew(Date birthDate) {
        this.birthDate = birthDate;
    }

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(BOOM_START) >= 0
                && birthDate.compareTo(BOOM_END) < 0;
    }
}
