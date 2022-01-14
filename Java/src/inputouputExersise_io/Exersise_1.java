package inputouputExersise_io;

import java.io.File;

public class Exersise_1 {
	public static void main(String[] args) {
			File f = new File ("c:/");
			File[] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if(list[i].isFile()) {
					System.out.println((i+1)+" : "+ list[i].getName());
				}
			}
		}
}