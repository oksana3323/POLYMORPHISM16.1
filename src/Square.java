public class Square extends Shapes {

  private   int length;
private  int height;

    public Square(int length, int height) {
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

    public int getHeight() {
        return height;
    }

    @Override
    public void findArea(int w,int z) {
        System.out.println(w*z);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}

