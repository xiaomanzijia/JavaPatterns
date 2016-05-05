package zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by licheng on 5/5/16.
 */

@Target(ElementType.FIELD)
public @interface NoDBColumn {
}
