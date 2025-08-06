package Abstract;

public class main {
    public static void main(String[] args) {

    Circle circle=new Circle(3);
    Triangle triangle=new Triangle(10,10);
    Rectangle rectangle=new Rectangle(10,10);

        System.out.printf("%.2f\n",circle.area());
        System.out.printf("%.2f\n",triangle.area());
        System.out.printf("%.2f\n",rectangle.area());


    }

}
