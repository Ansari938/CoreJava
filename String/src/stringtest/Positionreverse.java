package stringtest;

public class Positionreverse {

	public static void main(String[] args) {
		
		String name = "vijay dinanath chouhan";
		
		String[] name2 =name.split(" ");
		//System.out.println(name.lastIndexOf(' '));
	//	System.out.println("Reverse String");
		/*String a = name2[0];
		String[] b = a.split("");
		for(int i=(a.length()-1);i>0; i--) {
			System.out.print(b[i]);
		}
		System.out.print(" ");
		String a1 =name2[1];
		String[] b1 =a1.split("");
		for(int i1=(a1.length()-1);i1>0;i1--) {
			System.out.print(b1[i1]);
			
			}
			*/
		
		String a = name2[0];
		for(int i=(a.length()-1);i>=0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.print(" ");
		String a1 =name2[1];
		for(int i1=(a1.length()-1);i1>=0;i1--) {
			System.out.print(a1.charAt(i1));
			
			}
			
	}
}

	



