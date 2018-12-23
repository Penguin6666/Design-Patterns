package strategy;

/**
 * @Description:
 * @Author: penguin
 * @Date: 2018-12-23
 */
public class CashReturn extends CashSuper {

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double sum = money;
        int i = 0;
        while (sum >= moneyCondition) {
            sum -= moneyCondition;
            i++;
        }
        return money - i * moneyReturn;
    }

}
