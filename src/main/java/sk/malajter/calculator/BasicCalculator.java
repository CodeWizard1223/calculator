package calculator;

import operations.Operation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator {


    public BasicCalculator(String name, Map<Character, Operation> operationMap) {
        super(name, operationMap);
    }
}
