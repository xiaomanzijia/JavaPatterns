package effectivejava.mutiparamsconstructor.nonecessatyobject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by licheng on 10/4/16.
 */
public class Person {

    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){ //判断婴儿是否在生育高峰期出生
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0
                && birthDate.compareTo(boomEnd) < 0;
    }
}
