public class Triangle extends Shapes{
private int length;
 private int height;

    public Triangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void findArea(int c,int j) {
        System.out.println(c*j);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
