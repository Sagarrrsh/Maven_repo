package devops.sl;

public class MyCalc {
	
	int sum(int a, int b)
	{
		int c;
		int d;
		c=10+5;
		return c;
	}
	int diff(int a, int b)
	{
		return a-b;
	}
	int mul(int a, int b)
	{
		return a-b;
	}
	int div(int a, int b)
	{
		return a/b;
	}
	int mod(int a, int b)
	{
		return a%b;
	}


	public static void main(String[] args) {

		MyCalc calc = new MyCalc();
		Demo ob = new Demo();
		System.out.println("Sum is : "+calc.sum(20, 10));
		System.out.println("Diff is : "+calc.diff(20, 10));
		System.out.println("Mul is : "+calc.mul(20, 10));
		System.out.println("Div is : "+calc.div(20, 10));
		System.out.println("Mod is : "+calc.mod(20, 10));
		ob.greet();
		ob.show();
	}
}
