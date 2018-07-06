import java.lang.Math.*;
import java.lang.Exception;
import java.util.*;
class CustomException extends Exception{
	public CustomException(String message){
		super(message);
	}
}

class Shape{
	double width,height;
	Shape(double width, double height){
		this.width=width;
		this.height=height;
	}
	public double getArea(double width, double height){
		return width*height;
	}
	public double getPerimeter(double width, double height){
		 return 2*height*width;
	}
	
	public boolean equals(Shape s){
		return this.getClass()==s.getClass();
	}

}

class Circle extends Shape{
	double radius;
	Circle(double radius) throws Exception{
		super(0,0);
		this.radius=radius;
	}
	public double getArea(double radius){
		return Math.PI*radius*radius;
	}
	public double getPerimeter(double radius){
		 return 2*Math.PI*radius;
	}
}

class Square extends Shape{
	Square(double width,double height){
		super(width, height);
	}
}

public class Test{
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle(3);
		Square s=new Square(4,4);
		System.out.println("area of Circle:"+c.getArea(c.radius));
		System.out.println("area of Square:"+s.getArea(s.width, s.height));
		double r=sc.nextDouble();
		if(r<0){
			throw new CustomException("radius cannot negative");
		}
		Circle c1=new Circle(r);
		System.out.println("area of Circle:"+c1.getArea(c1.radius));
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		if(w<0||h<0){
			throw new CustomException("width and height cannot negative");
		}
		Square s1=new Square(w,h); 
		System.out.println("area of Square:"+s1.getArea(s1.width, s1.height));
		System.out.println(s1.equals(c1));
		Shape sc1=new Square(3,4);
		System.out.println("upward casting and area:"+sc1.getArea(sc1.width,sc1.height));
		Shape sh=sc1;
		Square c2=new Square(3,4);
		if(sh instanceof Square){
			c2=(Square)sh;
			System.out.println("down casting area:"+c2.getArea(c2.width,c2.height));
		}

	}
}