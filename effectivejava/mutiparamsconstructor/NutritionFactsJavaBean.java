package effectivejava.mutiparamsconstructor;

/**
 * Created by licheng on 10/4/16.
 */
public class NutritionFactsJavaBean {  //JavaBean模式
    private  int servingSize;
    private  int servings;
    private  int calories;
    private  int fat;
    private  int sodium;
    private  int carbohydrate;

    public NutritionFactsJavaBean() {
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }
}
