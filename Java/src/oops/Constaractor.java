package oops;

public class Constaractor {
	public static final double PI = 3.14;
	private String Colour;
	private int boarderwidth;
	
	public Constaractor() {
		
		
	}
	public Constaractor(String c, int w) {
		Colour = c;
		boarderwidth =w;
		
	}
	
	public String getColour() {
		return Colour;
	}
	
	
	public int getBoarderwidth() {
		return boarderwidth;
	}
	
	
	
	

}
