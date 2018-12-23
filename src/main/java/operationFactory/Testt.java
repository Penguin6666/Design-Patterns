package operationFactory;

import org.junit.Test;

/**
 * @Description:
 * @Author: penguin
 * @Date: 2018-12-23
 */
public class Testt {

    @Test
    public void test01(){
        Operation operation = OperationFactory.createOperation("+");
        double getresult = operation.getresult(2, 3);
        System.out.println(getresult);
    }
}
