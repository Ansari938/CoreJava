package datetime;

public class Test {

	public static void main(String[] args) {
		int a = 10;
		/*for(int i = 0;i<=10;i++) {
			a = 2*i;
			System.out.println(" 2* "+i+" = "+a);
		}*/
		int b= 40;
		Test t = new Test();
		int c = t.add(a,b);
		System.out.println("a+b="+c);

	}
	public int add(int a,int b) {
		int c= 0;
		c= a+b;
		return c;
	}

}
