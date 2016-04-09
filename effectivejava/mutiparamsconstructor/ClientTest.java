package effectivejava.mutiparamsconstructor;

/**
 * Created by licheng on 9/4/16.
 */
public class ClientTest {
    public static void main(String[] args) {

        NutritionFacts facts = new NutritionFacts(12,34,2,5,3,5); //多参数构造器

        NutritionFactsJavaBean factsJavaBean = new NutritionFactsJavaBean(); //JavaBean模式
        factsJavaBean.setCalories(34);
        factsJavaBean.setCarbohydrate(33);
        factsJavaBean.setFat(333);
        factsJavaBean.setServings(345);

        NutritionFactsBuilder builder = new NutritionFactsBuilder.Builder(12,34) //构建器
                .calories(44)
                .carbohydrate(55)
                .fat(456)
                .sodium(23)
                .build();


    }
}
