package inputoutputio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyTextfile {
	public static void main(String[] args) throws Exception {
		String src = "F:/java.txt";
		String trgt = "F:/hello.text";

		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(trgt);

		int ch = fr.read();
		while (ch != -1) {

			fw.write(ch);
			ch = fr.read();

		}

		System.out.println(src + "is copy to" + trgt);

		fr.close();
		fw.close();

	}

}
