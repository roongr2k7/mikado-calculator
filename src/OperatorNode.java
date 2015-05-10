public class OperatorNode extends ValueNode {
    private String operator;
    private ValueNode leftOperand;
    private ValueNode rightOperand;


    public OperatorNode(String operator, ValueNode leftOperand, ValueNode rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int compute() {
        if (operator == "+")
            return leftOperand.value + rightOperand.value;
        else if (operator == "-")
            return leftOperand.value - rightOperand.value;
        return computeValueNode();
    }

    @Override
    public String toString() {
        if (operator != null)
            return leftOperand.value + " " + operator + " " + rightOperand.value;
        return toStringValueNode();
    }

}
