package zhujie;

/**
 * Created by licheng on 5/5/16.
 */
public class Apple {

    @FruitName("apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.YELLOW)
    private String appleColor;

    @FruitProvider(id = 1,name = "富士康", address = "浙江金华")
    private String appleProvider;

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}
