package exerscise;

public class Reversedigit {
	public static void main(String[] args) {
	
	int num =512,rem,rev=0;
	while(num>0) 
	{
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	System.out.print(rev + " ");
}
}
}