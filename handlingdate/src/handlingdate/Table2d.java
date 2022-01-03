package handlingdate;

public class Table2d {
	public static void main(String[] args) {
		
		int s=1;
		int [][] a=new int [10][10];
		for (int i=1; i <=10; i++ ) {
			System.out.println(" ");
			for (int j=1; j <=i; j++) {
				s=i+j;
				System.out.print(" 	"+ s);
			}
		}
	}
}
