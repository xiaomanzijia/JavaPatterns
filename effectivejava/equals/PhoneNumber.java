package effectivejava.mutiparamsconstructor.equals;

/**
 * Created by licheng on 20/4/16.
 */
public class PhoneNumber {
    private final int areaCode;
    private final int prefix;
    private final int lineNumber;

    private volatile int hashCode;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode , 999 ,"area code");
        rangeCheck(prefix , 999 ,"prefix");
        rangeCheck(lineNumber , 999 ,"line number");
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name){
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name+" "+arg);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof PhoneNumber))
            return false;
        PhoneNumber p = (PhoneNumber) obj;
        return p.areaCode == areaCode &&
                p.prefix == prefix &&
                p.lineNumber == lineNumber;
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if(result == 0){
            result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return hashCode;
    }
}
