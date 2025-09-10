package mypackage;
 class Shapee{
	void display() {
	System.out.println("i am a shape");
}

}
class Circle extends Shapee{
	int radius;
	Circle(int r){
		radius=r;
	}
void area() {
	System.out.println("area of circle="+(3.14*radius*radius));
}
}
class Rectangle extends Shapee{
	int length,width;
	Rectangle(int l,int w){
		length=l;
		width=w;
	}
	void area() {
		System.out.println("area of rectangle="+(length*width));
	}
}
public class Shape{
public  static void main(String[]args) {
	Circle c=new Circle(5) ;
	Rectangle r=new Rectangle(2,7);
	
	c.area();

	r.area();
}		
}
