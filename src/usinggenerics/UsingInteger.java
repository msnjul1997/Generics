package usinggenerics;

public class UsingInteger {
	public static void main(String[] args)
	{
		int a = 20 , b= 30 , c= 25;
		if ( a>b && a>c )
		System.out.println(a+ " is the largest number");
		else if ( b>a && b>c)
		System.out.println(b+  " is the largest number");
		else
		System.out.println(c+  " is the largest number"); 
	}

}
