import java.util.Scanner;

class AreaCalculator {
    
    
    double area(double radius) {
        return Math.PI * radius * radius;
    }

  
    double area(double length, double width) {
        return length * width;
    }

    
    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    
}

public class OverloadedArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator(); 
        
        
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + calc.area(radius));

        
        System.out.print("\nEnter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle: " + calc.area(length, width));

        
        System.out.print("\nEnter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + calc.area(base, height, true));
        
        

        sc.close();
    }
}

