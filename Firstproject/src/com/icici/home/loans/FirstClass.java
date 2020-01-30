package com.icici.home.loans;

public class FirstClass 
{
int a=10,b=20,c;

public void add()
{
	c=a+b;
	System.out.println("Addition of A+B is :"+c);
}
public void sub()
{ 
	c=a-b;
	System.out.println("Addition of A+B is :"+c);
}
	public static void main(String[] args) 
	{
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();// TODO Auto-generated method stub

	}

}
