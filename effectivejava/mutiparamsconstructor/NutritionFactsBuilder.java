package effectivejava.mutiparamsconstructor;

/**
 * Created by licheng on 10/4/16.
 */
public class NutritionFactsBuilder { //构建器模式
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        private final int servingSize;
        private final int servings;

        private  int calories = 0;
        private  int fat = 0;
        private  int sodium = 0;
        private  int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public Builder sodium(int val){
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }

        public NutritionFactsBuilder build(){
            return new NutritionFactsBuilder(this);
        }
    }

    private NutritionFactsBuilder(Builder builder){
        servings = builder.servings;
        servingSize = builder.servingSize;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}
