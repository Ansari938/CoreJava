package inputoutputio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Keyboardwrite {
	public static void main(String[] args) throws Exception {

		String trgt = "f:/keyboard.text";
		FileWriter Write = new FileWriter(trgt);
		PrintWriter printWriter = new PrintWriter(Write);

		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);

		String line = in.readLine();
		while (!line.equals("quit")) {

			printWriter.print(line);
			line = in.readLine();

		}

		printWriter.close();
		isReader.close();

	}

}
