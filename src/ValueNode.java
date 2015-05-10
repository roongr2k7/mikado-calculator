public class ValueNode implements Node {
    protected int value;

    public ValueNode() {}

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int compute() {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    }

}
