package stringtest;

public class Funtionjava {
public static void main(String[] args) {
	String n = "vijay Dinanath Chouhan";
	System.out.println("String lenght:" + (n.length()));
    System.out.println("7th character:"+ (n.charAt(6)) );
    System.out.println("dina index:" + (n.indexOf("Dina")));
    System.out.println("first position :" + ((n.lastIndexOf("i"))));
    System.out.println("last position :" + ((n.lastIndexOf("h"))));
    System.out.println("a is replace by b :"+ (n.replace("a" , "c")));
	System.out.println(n.replaceAll("[a-i]", "k"));
	System.out.println(n.toLowerCase());
	System.out.println(n.toUpperCase());
	System.out.println(n.startsWith("dina"));
	System.out.println(n.endsWith("Chouhan"));
	System.out.println(n.substring(7));
	
	String[]b=n.split("a");
	System.out.println(b[3]);
}
}

			