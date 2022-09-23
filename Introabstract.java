 


 
public class Introabstract {

    
    public static void main(String[] args) {
     
         Shape[] list = new Shape[5];

        list[0] = new Rectangle(2, 5);
        list[1] = new Circle(5);
        list[2] = new Rectangle();
        list[3] = new Square(5);
        list[4] = new Square(6, "blue", true);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            System.out.println("Area = " + list[i].getArea());
            System.out.println("Perimeter = " + list[i].getPerimeter());
            System.out.println("---");
        }

    }
    }
    

