package MyPackage;

import java.util.*;


public class Main {

	
	public static void main(String []args)
	{
	Stack <Integer> a = new Stack<>();
	Stack <Integer> b = new Stack<>();
	Scanner in = new Scanner(System.in);
	
	int x;
	
	x=in.nextInt();
	
	while(x > 0){
		a.push(x%10);
		x/=10;
		} 
	System.out.println("Stack a is :" + a);
	System.out.println("Stack a is filled.");
	int y;
	y=in.nextInt();
	
	while(y > 0){
		b.push(y%10);
		y/=10;
		} 
	System.out.println("Stack b is :" + b);
	System.out.println("Stack b is filled.");
	
	changeStack(a,b);
	System.out.println("Stack a is :" + a);
	System.out.println("Stack b is :" + b);
	
	}
	
	public static void changeStack(Stack a,Stack b){
		Stack c = new Stack();
		c.addAll(a);
		a.removeAllElements();
		a.addAll(b);
		b.removeAllElements();
		b.addAll(c);
	}
}
