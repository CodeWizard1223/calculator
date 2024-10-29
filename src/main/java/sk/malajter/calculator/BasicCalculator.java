package sk.malajter.calculator;

import sk.malajter.operations.ArithmeticOperator;
import sk.malajter.operations.Operation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator {


    public BasicCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}
