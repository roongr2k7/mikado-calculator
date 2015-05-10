public class OperatorNode implements Node {
    private int value;
    private String operator;
    private OperatorNode leftOperand;
    private OperatorNode rightOperand;

    private OperatorNode(int value) {
        this.value = value;
    }

    public OperatorNode(String operator, OperatorNode leftOperand, OperatorNode rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public static OperatorNode createValueNode(int value) {
        return new OperatorNode(value);
    }

    @Override
    public int compute() {
        if (operator == "+")
            return leftOperand.value + rightOperand.value;
        else if (operator == "-")
            return leftOperand.value - rightOperand.value;
        return computeValueNode();
    }

    public int computeValueNode() {
        return value;
    }

    @Override
    public String toString() {
        if (operator != null)
            return leftOperand.value + " " + operator + " " + rightOperand.value;
        return toStringValueNode();
    }

    public String toStringValueNode() {
        return value + "";
    }
}
