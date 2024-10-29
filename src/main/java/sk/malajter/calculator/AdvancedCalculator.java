package sk.malajter.calculator;

import sk.malajter.operations.ArithmeticOperator;
import sk.malajter.operations.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {


    public AdvancedCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}
