/*
Lab Assignment 4
@Name : Rakhee Gaikwad
@Date : 3 Nov 2022

Program 2:- Create shape class and it has two child class circle and sqaure. both class have getArea() 
method to display area of that shape .
*/
package basic;

//declaring class Circle
class Circle extends Shape 		// child class Circle
{
	public void getArea() //creating getArea method
	{
	int r=6;
	 double pi =4.17, area;
	 double Area = pi*r*r;	// calculating area of Circle
	 System.out.println("Area of circle:"+Area);	// printing area of Circle
	}
}
//end of class Circle

//declaring class Circle
class Square extends Shape 		// child class Square
{
	public void getArea() //creating getArea method
	{
		int a =4;
		double Area=a*a;	// calculating area og Sqaure
		System.out.println("Area of Square:"+Area);		// printing area of Square	
	}
}
//end of class Square


//declaring a class Shape
public class Shape 		// parent class 
{
	//calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Circle obj =new Circle(); //creating new object
		System.out.println("Area of Circle:");	
		obj.getArea();	//calling getmethod of class Circle
		Square obj1 =new Square(); //creating new object
		System.out.println("Area of Square:");	//printing Area of Square
		obj1.getArea();	//calling getmethod of class Square
		
	}
	//end main method
}
//end of  a class Shape

/*
Output=
Area of Circle:
Area of circle:150.12
Area of Square:
Area of Square:16.0
*/