package inputoutputio;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copyimage {
	
	public static void main(String[] args) throws Exception {
		
		String src =   "f:/test.png";
		String trgt =  "f:/paste.png";
		
		
		
		FileInputStream fr = new FileInputStream(src);
		FileOutputStream fw  =new FileOutputStream(trgt);
		
		int ch = 0;
		while(ch!=-1) {
			ch=fr.read();
			fw.write(ch);
		}
		System.out.println("done");
		System.out.println(src+"is copy to"+ trgt);
		fw.close();
		fr.close();
		
		
	}
	
}

	
	
	


