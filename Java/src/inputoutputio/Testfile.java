package inputoutputio;

import java.io.File;
import java.sql.Date;

import basic.forloopjava;

public class Testfile {
     
	private static String length;

	public static void main(String[] args) {
		
		
		File f = new File("F:/java.txt");
		
		if(f.exists()) {
			
			System.out.println("name   " + f.getName());
			System.out.println("path " + f.getAbsolutePath());
			System.out.println("readable " + f.canRead());
			System.out.println("writable " + f.canWrite());
            System.out.println(" is file "+ f.isFile());
			System.out.println("is Dr " + f.isDirectory());
			
			// last  modification date of file/diractory//
			
			Date d =new Date(f.lastModified());
			System.out.println("Date modified " + d);
			
			
			//Length of File //
			long length = f.length();
			System.out.println("length:"+ length + "bytes");
		}else {
			System.out.println("file does not exist");
		}
			
			
		// list diractories and files //
		
		File diractory = new File ("F:\\diractorys");
		String[] Files = diractory.list();
		for (String F : Files) {
			System.out.println(F);
			
		}
		
		// display only file 
		
		for (int i = 0; i < Files.length; i++) {
			File f1 = new File("F:\\diractorys" , Files[i]);
			if(f1.isFile()) {
			System.out.println(Files[i]);
			
		}
			}
		
		
		
		
		
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

