package buildpattern;

/**
 * Created by licheng on 21/2/16.
 */
public class InsuranceContractTest {
    public static void main(String[] args) {
        //创建构建器对象
        InsuranceContract.ConcreteBuilder builder =
                new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
        //设置需要的数据，然后构建保险合同对象
        InsuranceContract contract =
                builder.setCompanyName("xiao")
                .setOtherData("dd")
                .build();
        //操作保险合同对象的方法
        contract.someOperation();
    }
}
