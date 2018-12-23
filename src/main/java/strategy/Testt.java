package strategy;

import org.junit.Test;

/**
 * @Description:
 * @Author: penguin
 * @Date: 2018-12-23
 */
public class Testt {

    @Test
    public void test01(){
        CashReturn cashReturn = new CashReturn(1000, 400);
        double v = cashReturn.acceptCash(9999);
        System.out.println(v);
    }

    @Test
    public void test02(){
        CashRebate cashRebate = new CashRebate(0.8);
        double v = cashRebate.acceptCash(9999);
        System.out.println(v);
    }
}
