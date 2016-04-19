package effectivejava.mutiparamsconstructor.equals;

/**
 * Created by licheng on 18/4/16.
 */
public class CaseInsesitiveString {
    private final String s;

    public CaseInsesitiveString(String s) {
        if(s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseInsesitiveString){
            return s.equalsIgnoreCase(((CaseInsesitiveString) obj).s);
        }

        if(obj instanceof String){
            return s.equalsIgnoreCase((String) obj);
        }
        return false;

        //正确写法 以上写法违反了对称性
//        return obj instanceof CaseInsesitiveString
//                && s.equalsIgnoreCase(((CaseInsesitiveString) obj).s);
    }
}
