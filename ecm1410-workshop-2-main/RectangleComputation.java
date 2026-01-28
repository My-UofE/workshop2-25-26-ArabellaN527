public class RectangleComputation {
    public static void main(String[] args) {

        // Read the command line arguments
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        // Calculate area and perimeter
        double area = height * width;
        double perimeter = 2 * (height + width);

        //results
        System.out.println("Shape: rectangle");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
