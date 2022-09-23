
 
public class CircleArea extends NumbersComparison {

    private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
