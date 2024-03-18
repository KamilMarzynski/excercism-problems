class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        switch (operation) {
            case "+":
                return String.valueOf(operand1) + " " + operation + " " + String.valueOf(operand2) + " = " +
                        String.valueOf(operand1 + operand2);
            case "*":
                return String.valueOf(operand1) + " " + operation + " " + String.valueOf(operand2) + " = "
                        + String.valueOf(operand1 * operand2);
            case "/":
                if (operand2 == 0) {
                    throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
                }
                return String.valueOf(operand1) + " " + operation + " " + String.valueOf(operand2) + " = "
                        + String.valueOf(operand1 / operand2);
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}
