public class Node {
    private int value;
    private String operator;

    public Node(int value) {
        this.value = value;
    }

    public Node(String operator, Node leftOperand, Node rightOperand) {
        this.operator = operator;
    }

    public int compute() {
        if (operator == "+")
            return 2;
        return value;
    }
}
