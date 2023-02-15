public class Circle extends Shapes{
private int length;
private int smeshinStoronu;

    public Circle(int length, int smeshinStoronu) {
        this.length = length;
        this.smeshinStoronu = smeshinStoronu;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSmeshinStoronu(int smeshinStoronu) {
        this.smeshinStoronu = smeshinStoronu;
    }

    public int getLength() {
        return length;
    }

    public int getSmeshinStoronu() {
        return smeshinStoronu;
    }

    @Override
    public void findArea(int e,int k) {
        System.out.println(e*k);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "length=" + length +
                ", smeshinStoronu=" + smeshinStoronu +
                '}';
    }
}
