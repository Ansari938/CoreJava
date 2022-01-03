package exerscise;

public class Primenumber {
	public static void main(String[] args) {
		int num=12;
		boolean condition = false;
		for (int i=2;1<=num/2; i++)
		{
			if(num%i==0)
			condition=true;
			break;
		}
	if(!condition)
			System.out.println("prime num :" + num);
	else
			System.out.println("not prime :" + num);
		
	}

}


