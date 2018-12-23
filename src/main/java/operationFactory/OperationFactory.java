package operationFactory;

/**
 * @Description:
 * @Author: penguin
 * @Date: 2018-12-23
 */
public class OperationFactory {

    public static Operation createOperation(String str) {
        Operation operation = null;
        switch (str) {
            case "+":
                operation = new OperationAdd();
            default:
                break;
        }
        return operation;
    }
}
