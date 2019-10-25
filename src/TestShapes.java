import java.util.Scanner;

public class TestShapes {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        TestShapes ts = new TestShapes();

        String inputShape;
        boolean invalidInput = true;


        while(invalidInput){
            System.out.print("\nEnter a shape: ");
            inputShape = in.next();

            if(inputShape.equals("circle")){
                ts.Circle();
                invalidInput = false;
            }else if(inputShape.equals("rectangle")){
                ts.Rectangle();
                invalidInput = false;
            }else if(inputShape.equals("square")){
                ts.Square();
                invalidInput = false;
            }else if(inputShape.equals("triangle")){
                ts.Triangle();
                invalidInput = false;
            }
        }
    }

    public void Circle(){
        System.out.print("Enter a radius: ");
        double circleRadius = in.nextDouble();

        double circleArea = Math.PI * Math.pow(circleRadius,2);

        System.out.print("\nArea: " + String.format("%.2f\n",circleArea));

    }

    public void Rectangle(){
        System.out.print("Enter a length: ");
        double rectLength = in.nextDouble();
        System.out.print("Enter a width: ");
        double rectWidth = in.nextDouble();

        double rectArea = rectLength * rectWidth;

        System.out.print("\nArea: " + String.format("%.2f\n",rectArea));
    }

    public void Square(){
        System.out.print("Enter a side: ");
        double sqSide = in.nextDouble();

        double sqArea = sqSide * sqSide;

        System.out.print("\nArea: " + String.format("%.2f\n",sqArea));
    }

    public void Triangle(){
        System.out.print("Enter a base: ");
        double triBase = in.nextDouble();
        System.out.print("Enter a height: ");
        double triHeight = in.nextDouble();

        double triArea = (triBase * triHeight)/2;

        System.out.print("\nArea: " + String.format("%.2f\n",triArea));
    }

}
