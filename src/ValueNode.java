public abstract class ValueNode implements Node {
    protected int value;

    @Override
    abstract int compute();

    public int computeValueNode() {
        return value;
    }

    @Override
    abstract String toString();

    public String toStringValueNode() {
        return value + "";
    }
}
