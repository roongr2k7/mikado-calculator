public class Node {
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node(String operator, Node leftOperand, Node rightOperand) {
    }

    public int compute() {
        return value;
    }
}
