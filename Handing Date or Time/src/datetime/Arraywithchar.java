package datetime;

public class Arraywithchar {
public static void main(String[] args) {
	char[] a = {'a','b','c','d','e','f','g'};
	char[] d =new char [7];
System.arraycopy(a,0,d,0,5);
for (char c : d)
	System.out.println(c);
}
}
