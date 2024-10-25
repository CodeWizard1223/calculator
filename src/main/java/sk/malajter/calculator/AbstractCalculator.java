package calculator;

import operations.Operation;

import java.util.Map;

public abstract class AbstractCalculator {

    private final String name;

    private final Map<Character, Operation> operationMap;

    public AbstractCalculator(String name, Map<Character, Operation> operationMap) {
        this.name = name;
        this.operationMap = operationMap;
    }
}
