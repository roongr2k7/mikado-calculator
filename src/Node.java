public class Node {
    private int value;
    private String operator;
    private Node leftOperand;
    private Node rightOperand;

    public Node(int value) {
        this.value = value;
    }

    public Node(String operator, Node leftOperand, Node rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int compute() {
        if (operator == "+")
            return leftOperand.value + rightOperand.value;
        else if (operator == "-")
            return leftOperand.value - rightOperand.value;
        return value;
    }

    @Override
    public String toString() {
        if (operator == "+")
            return leftOperand.value + " " + operator + " " + rightOperand.value;
        if (operator == "-")
            return leftOperand.value + " " + operator + " " + rightOperand.value;
        return value + "";
    }
}
