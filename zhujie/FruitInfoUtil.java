package zhujie;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sun.rmi.runtime.Log;

/**
 * Created by licheng on 5/5/16.
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        String strFruitName = "";
        String strFruitColor = "";
        String strFruitProvider = "";

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = fruitName.value();
                System.out.println(strFruitName);
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider = fruitProvider.address() + " " + fruitProvider.name() + " " + fruitProvider.id();
                System.out.println(strFruitProvider);
            }
        }
    }

    public static String assembleSqlFromObj(Object obj){
        StringBuffer sql = new StringBuffer();
        Table table = obj.getClass().getAnnotation(Table.class);
        String tableName = table.value();
        sql.append("select * from " + tableName + " where 1=1 ");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields){
            String fieldName = field.getName();
            String methodName = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
            Column column = field.getAnnotation(Column.class);
            if(column != null){
                try {
                    Method method = obj.getClass().getMethod(methodName);
                    String value = (String) method.invoke(obj); //根据方法名获取值
                    System.out.println(methodName + " " + method + " " + value);
                    if (value != null && !value.equals("")) {
                        if (!isNum(column.value()) && !isNum(value)) {
                            // 判断参数是不是 in 类型参数 1,2,3
                            if (value.contains(",")) {
                                sql.append(" and " + column.value() + " in (" + value + ") ");
                            } else {
                                sql.append(" and " + column.value() + " like '%" + value + "%' ");
                            }
                        } else {
                            sql.append(" and " + column.value() + "=" + value + " ");
                        }
                    }

                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return sql.toString();
    }

    /**
     * 检查给定的值是不是 id 类型 1.检查字段名称 2.检查字段值
     * @param target
     * @return
     */
    public static boolean isNum(String target) {
        boolean isNum = false;
        if (target.toLowerCase().contains("id")) {
            isNum = true;
        }
        if (target.matches("\\d+")) {
            isNum = true;
        }
        return isNum;
    }
}
