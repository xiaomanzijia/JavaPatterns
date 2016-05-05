package zhujie;

import java.lang.annotation.Inherited;

/**
 * Created by licheng on 5/5/16.
 */
@Inherited
public @interface Greeting {
    public enum FontColor{ BULE,RED,GREEN};
    String name();
    FontColor fontColor() default FontColor.GREEN;
}
