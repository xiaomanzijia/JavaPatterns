package zhujie;

/**
 * Created by licheng on 5/5/16.
 */
public class ZhuJieTest {
    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);

        //类反射注解生成sql语句
        TableDto TableDto = new TableDto("123", "34");
        TableDto TableDto1 = new TableDto("123", "test1");
        TableDto TableDto2 = new TableDto("", "test1,test2,test3,test4");
        String sql = FruitInfoUtil.assembleSqlFromObj(TableDto);
        String sql1 = FruitInfoUtil.assembleSqlFromObj(TableDto1);
        String sql2 = FruitInfoUtil.assembleSqlFromObj(TableDto2);
        System.out.println(sql);
        System.out.println(sql1);
        System.out.println(sql2);
    }
}
