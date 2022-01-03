package stringtest;

public class ReverseAb {
public static void main(String[] args) {
	 String A= "vijay dinanath chouhan";
	 String B=" ";
	 for (int i= A.length()-1; i>=0; i--) {
		 B=B+A.charAt(i);
	 }
System.out.println(B);
}

}