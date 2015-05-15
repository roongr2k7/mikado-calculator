import java.util.Objects;

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
        if ("+".equals(operator))
            return leftOperand.value + rightOperand.value;
        else if ("-".equals(operator))
            return leftOperand.value - rightOperand.value;
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        if (operator != null)
            return leftOperand.value + " " + operator + " " + rightOperand.value;
        throw new IllegalArgumentException();
    }

}
