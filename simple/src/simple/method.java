package simple;
public class method {
	public static void multiply(int a,int b) {
		System.out.println(a*b);
	}
	
	public static void print() {
		System.out.println("this is first method");
	}
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		multiply(10,10);
		print();
		int sum=add(2,3);
		System.out.println(sum);
	}
	
}