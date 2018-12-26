package strategy;

import java.math.BigDecimal;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/25 16:36
 */
public class Context {
    private CashSuper cashSuper;

    public Context(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double ContextAcceptCash(double b){
        return cashSuper.acceptCash(b);
    }
}
