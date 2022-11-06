/*
Lab Assignment 4
@Name : Rakhee Gaikwad
@Date : 3 Nov 2022

Program :- Try to create functional interface of Adder(add 2 numbers), UpperString(Convert String into Upper case)
and print them using lambda expression.
*/
package basic;

import java.util.ArrayList;
import java.util.List;

//declaring a class LambdaExpression 
public class LambdaExpression 
{
	interface Addition	//creating functional interface
	{
		public int Adder(int a,int b); 
	}
	
	//calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// using Lambda Expression for adding 2 numbers
		Addition z=(x,y)->
		{
			return x+y;	//returning
		};
		System.out.println(z.Adder(19, 32));	//adding int a,b and printing
		
		// using  Lambda Expression For converting String  to Upper Case
		
		List <String>name= new ArrayList<String>();
	
		name.add("rakhee");
		name.forEach((a)->
		{
			System.out.println(a.toUpperCase());	//printing to UpperCase(Rakhee)
		});
		
	}
	//end of main method
}
//end of a class LambdaExpression 	


/*
Output =
51
RAKHEE
*/