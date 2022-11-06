/*
Lab Assignment 4
@Name : Rakhee Gaikwad
@Date : 3 Nov 2022

Program 3:- Make aaraylist of 5 numbers and isolate even odd numbers using
lambda expression.
*/
package basic;

import java.util.ArrayList;
import java.util.List;

//declaring a class  ArrayList_Lambda 
public class ArrayList_Lambda 
{
	//calling main method 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<Integer> number=new ArrayList<Integer>();	// Array list
		
		number.add(23);		//adding numbers to Array list
		number.add(44);		
		number.add(12);
		number.add(10);
		number.add(19);
		
		number.forEach((x)->System.out.println(x)); //printing numbers
		
		//using lambda expression for printing Even Odd numbers
		number.forEach((x)->
		{
			if(x%2==1)
			{
				System.out.println("Number is Odd:"+x);	// for Odd number
			}
			else 
			{
				System.out.println("Number is Even:"+x);	// for even number
			}
		});
	}
	//calling main method 
}
//end a class  ArrayList_Lambda 

/*
Output=
23
44
12
10
19
Number is Odd:23
Number is Even:44
Number is Even:12
Number is Even:10
Number is Odd:19
*/
