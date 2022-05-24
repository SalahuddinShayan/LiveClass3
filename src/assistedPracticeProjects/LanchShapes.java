package assistedPracticeProjects;

import java.util.Scanner;
//find area of different shapes
//through abstraction we will enforce method overriding
abstract class Shapes{ //parent -- abstract class
 double area;
 abstract void getData();//used for fetching the information
 abstract void calculate();//used for calculating the area
 void disp() {
     System.out.println("The area is :"+area);
 }
}
class Circle extends Shapes{
 float r;//radius
 float pi = 3.147f;
 @Override
 void calculate() {
     area = pi * r * r;
 }
 @Override
 void getData() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the radius:");
     r = sc.nextFloat();
 }
 
}
class Square extends Shapes{
    float side;//side
    @Override
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side:");
        side = sc.nextFloat();
    }
    @Override
    void calculate() {
        area = side * side;
    }
}
class Rectangle extends Shapes{
    float l,b;//length and breadth
    @Override
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        l = sc.nextFloat();
        System.out.println("Enter the breadth:");
        b = sc.nextFloat();
    }
    @Override
    void calculate() {
        area = l * b;
    }
}
class Geometry{
    void usage(Shapes s) {
        s.getData();
        s.calculate();
        s.disp();
    }
}
public class LanchShapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle rc = new Rectangle();
        Square sq = new Square();
        
        c.getData();//overridden method
        c.calculate();//overridden method
        c.disp();//inherited method
        
        rc.getData();//overridden method
        rc.calculate();//overridden method
        rc.disp();//inherited method
        
        sq.getData();//overridden method
        sq.calculate();//overridden method
        sq.disp();//inherited method
        
 //       Shapes sp = new Shapes();//we cannot instantiate the incomplete classes
        Geometry g =new Geometry();
        g.usage(c);
        g.usage(sq);
        g.usage(rc);
    }
}
