package inputoutputio;

import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writerfile {
	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("F:\\java.txt");
		PrintWriter pw = new PrintWriter(fw);

		for (int i = 0; i <= 5; i++) {
			pw.println("anari and java");

		}
		System.out.println("done");
		pw.close();
		fw.close();

	}

	public void close() throws Exception {

	}

}
