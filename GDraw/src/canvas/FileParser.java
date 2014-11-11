package canvas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {
	private static ArrayList<String> lines;

	public FileParser(File f) {

	}

	public static ArrayList<String> openFile(File f) throws IOException {
		BufferedReader br = null;
		lines = new ArrayList<String>();
		try {
			String currentLine;
			br = new BufferedReader(new FileReader(f));
			while ((currentLine = br.readLine()) != null) {
				currentLine.replaceAll("\r", "");
				currentLine.replaceAll("\t", "");
				currentLine.replaceAll(" ", "");
				if (!currentLine.isEmpty())
					lines.add(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
		br.close();
		return lines;
	}
}
