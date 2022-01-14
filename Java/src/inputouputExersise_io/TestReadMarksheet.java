package inputouputExersise_io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
	public class  TestReadMarksheet {
		 public static void main(String[] args) throws Exception {
				
			   FileInputStream file = new FileInputStream("D:/marksheet.ser");
			   ObjectInputStream in = new ObjectInputStream(file);
			   
			   ExcerciseMarkshhet m = (ExcerciseMarkshh) in.readObject();
			   
			   System.out.println("name :" + m.getName());
			   System.out.println("maths :"+m.getMaths());
			   System.out.println("physics :"+m.getPhysics());
			   System.out.println("chemisttry :"+m.getChemistry());
			   System.out.println("total mark :"+m.getTotal());
			   System.out.println("percentage : "+ m.getPercentage());
			   
			   in.close();
			   file.close();
			   
		}
	}



