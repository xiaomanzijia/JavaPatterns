package effectivejava.mutiparamsconstructor.equals;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by licheng on 20/4/16.
 */
public class EauqlHashCodeTest {
    public static void main(String[] args) {
        Map<PhoneNumber,String> map = new HashMap<PhoneNumber, String>();
        map.put(new PhoneNumber(707,867,77),"Jenny");
        System.out.println(map.get(new PhoneNumber(707,867,77)));
    }
}
