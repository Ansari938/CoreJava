package inputoutputio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText {
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
