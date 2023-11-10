package HomeWork7;

import HomeWork7.Operation;

public class Decorator implements Subtraction, Addition, Multiply, Division {
    protected Operation operation;

    public Decorator(Operation operation) {
        this.operation = operation;
    }

    @Override
    public Operation add(Operation z) {
        Operation result = operation.add(z);
        System.out.println("Addition operation Log:" + operation + " -> " + z + " = " + result);
        return result;
    }

    @Override
    public Operation sub(Operation z) {
        Operation result = operation.sub(z);
        System.out.println("Subtract operation Log:" + operation + " -> " + z + " = " + result);
        return result;
    }

    @Override
    public Operation mult(Operation z) {
        Operation result = operation.mult(z);
        System.out.println("Multiply operation Log:" + operation + " -> " + z + " = " + result);
        return result;
    }

    @Override
    public Operation div(Operation z) {
        Operation result = operation.div(z);
        System.out.println("Division operation Log:" + operation + " -> " + z + " = " + result);
        return result;
    }

    @Override
    public String toString() {
        return operation.toString();
    }

}
