package com.java.add;

class addtwonumbersparameters {

void AddDemo(int number1, int number2)
{
	int results=number1+number2;
System.out.println("sum of two numbers " + results);
}
}
public class addtwonumbersusingparameters {
public static void main(String args[])
{
	addtwonumbersparameters b = new addtwonumbersparameters(); //creating object here
			int results= b.AddDemo();//using parameters here
}
	
}
