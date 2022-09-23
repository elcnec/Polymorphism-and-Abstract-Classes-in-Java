

 
public abstract class NumbersComparison extends Comparison {

    @Override
    public void compare2Numbers(int n1, int n2) {

        if (n1 == n2) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are NOT equal!");
        }
    }

}
