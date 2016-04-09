package effectivejava.mutiparamsconstructor;

/**
 * Created by licheng on 9/4/16.
 */
public class NutritionFacts { //重叠构造器

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize,servings,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize,servings,calories,0);
    }

    public NutritionFacts(int servings, int servingSize, int caloriesm, int fat) {
        this(servings,servingSize,caloriesm,fat,0);
    }

    public NutritionFacts(int calories, int fat, int servings, int servingSize, int sodium) {
        this(calories,fat,servings,servingSize,sodium,0);
    }

    public NutritionFacts(int calories, int servingSize, int servings, int fat, int sodium, int carbohydrate) {
        this.calories = calories;
        this.servingSize = servingSize;
        this.servings = servings;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
