package polymorphism;
abstract class shape{
    abstract double area();
}
class Circle1 extends shape{
   double radius;
   Circle1(double radius){
       this.radius = radius;
   }
   double area(){
       return Math.PI * radius * radius;
   }
}
class Rectangle1 extends shape{
    double length;
    double width;
    Rectangle1(double length, double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length * width;
    }
}
class Triangle extends shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5 * base * height;
    }
}
public class abstract_polymorphism {
	public static void main(String[] args) {
		shape[] shapes = new shape[3];
        shapes[0] = new Circle1(5);
        shapes[1] = new Rectangle1(7,9);
        shapes[2] = new Triangle(10,6);
        
        for(int i=0;i < shapes.length;i++){
            System.out.println("Area: "+shapes[i].area());
        }
	}
}
