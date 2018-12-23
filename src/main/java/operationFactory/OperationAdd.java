package operationFactory;

/**
 * @Description:
 * @Author: penguin
 * @Date: 2018-12-23
 */
public class OperationAdd extends Operation {

    @Override
    public double getresult(double numA,double numB) {
        double result = 0;
        result = numA+numB;
        return result;
    }
}
