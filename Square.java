 


 
public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side, "purple", false);
//        color = "purple";
//        filled = false;
//        length = side;
//        width = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
//        length = side;
//        width = side;
//        this.color = color;
//        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + length
                + ", color=" + color + ", filled=" + filled + '}';
    }

}
