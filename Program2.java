import java.util.Scanner;
interface Area {
public void calculate();
}
class Rectangle implements Area {
int length, breadth, area;
public Rectangle(int length, int breadth) {
this.length = length;
this.breadth = breadth;
}
public void calculate() {
area = length * breadth;
System.out.println("Area of the rectangle is " + area);
}
}
class Square implements Area
{
int side, area;
public Square(int side) 
{
this.side = side;
}
public void calculate() 
{
area = side * side;
System.out.println("Area of the square is " + area);
}
}
class Program2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int length, breadth, side;
System.out.println("Enter the length for rectangle:");
length = scanner.nextInt();
System.out.println("Enter the breadth for rectangle:");
breadth = scanner.nextInt();
System.out.println("Enter the side for square:");
side = scanner.nextInt();
Rectangle rectangle = new Rectangle(length, breadth);
Square square = new Square(side);
rectangle.calculate();
square.calculate();
scanner.close();
}
}