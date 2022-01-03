package exerscise;

public class Elementmisisng {
public static void main(String[] args) {
	int sum=0; int sum1=0;
	
	int a[] = {16,548,45,10,45,8,52};
	int b[] =  {16,548,45,10,45,8};
	for (int i = 0; i <=a.length-1; i++) {
		sum=sum+a[i];
	}
		for (int j = 0; j <=b.length-1; j++) {
			sum1=sum1+b[j];

		}
		int h = sum-sum1;
		System.out.println(h);
	}
}

