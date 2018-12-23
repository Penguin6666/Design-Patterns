package strategy;

/**
 * @Description:
 * @Author: penguin
 * @Date: 2018-12-23
 */
public class CashRebate extends CashSuper {

    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }


    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
