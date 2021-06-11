package dppProject;
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(int w,int h) {
        this.width = w;
        this.height = h;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return this.height * this.width;
    }

    /**
     * LSP violation is case of a Square reference.
     */
    public final static void setDimensions(Rectangle r,int w,int h) {
          r.setWidth(w);
          r.setHeight(h);
          //assert r.getArea() == w * h
    }
}