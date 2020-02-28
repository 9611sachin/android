package simple;
import java.util.Scanner;
public class Simple {
   static int x;
   static int y;
   static int add;
   static int sub;
   static int mul;
   static int div;
   static int mod;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x" +x);
		int x=sc.nextInt();
		System.out.println("enter value of y" +y);
		int y=sc.nextInt();
		int choice;
		System.out.println("choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:add=x+y;
		System.out.println("add:"+add);
		break;
		case 2:sub=x-y;
		System.out.println("sub:"+sub);
		break;
		case 3:mul=x*y;
		System.out.println("mul:"+mul);
		break;
		case 4:div=x/y;
		System.out.println("div:"+div);
		case 5:mod=x%y;
		System.out.println("mod:"+mod);
		break;
		default:System.out.println("wrong choice");
		}
		    }   
	}
