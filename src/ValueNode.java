public class ValueNode implements Node {
    protected int value;

    @Override
    public int compute() {
        return computeValueNode();
    }

    public int computeValueNode() {
        return value;
    }

    @Override
    public String toString() {
        return toStringValueNode();
    }

    public String toStringValueNode() {
        return value + "";
    }
}
