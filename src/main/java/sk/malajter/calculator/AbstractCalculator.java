package sk.malajter.calculator;

import sk.malajter.Operands;
import sk.malajter.operations.ArithmeticOperator;
import sk.malajter.operations.Operation;

import java.util.Map;

public abstract class AbstractCalculator {

    private final String name;

    private final Map<ArithmeticOperator, Operation> operationMap;

    public AbstractCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        this.name = name;
        this.operationMap = operationMap;
    }

    public double calculate(Operands operands, ArithmeticOperator operator) {
        if (this.operationMap.containsKey(operator)) {
            final Operation operation = this.operationMap.get(operator);
            final double result = calculateResult(operands, operation);
            printResult(result);
            return result;
        } else {
            throw new IllegalArgumentException("Calculator doesn't support operation: " + operator);
        }
    }

    private double calculateResult(Operands operands, Operation operation) {
        return operation.calculate(operands.getLeft(), operands.getRight());
    }

    private void printResult(double result) {
        System.out.println(this.name + " calculated result " + result);
    }
}
