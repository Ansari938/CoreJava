package exerscise;

public class DimiensionalArray {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,596,6,7,8};
	int maxnumber =arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>maxnumber)
		{
			maxnumber=arr[i];
		}
	}
	System.out.println("the largest number" + maxnumber);
}
}
