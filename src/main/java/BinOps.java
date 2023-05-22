public class BinOps {
    protected int a, b;

    public String sum(String ab, String bb) {
        this.a = Integer.parseInt(ab, 2);
        this.b = Integer.parseInt(bb, 2);
        return Integer.toBinaryString(a + b);
    }

    public String mult(String ab, String bb) {
        this.a = Integer.parseInt(ab, 2);
        this.b = Integer.parseInt(bb, 2);
        return Integer.toBinaryString(a * b);
    }
}
