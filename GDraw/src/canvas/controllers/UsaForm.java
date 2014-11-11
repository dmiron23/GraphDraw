package canvas.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UsaForm {
	private static ArrayList<String> lines;

	public UsaForm() {

	}

	public static ArrayList<String> formatFile(File f) throws IOException {
		BufferedReader br = null;
		lines = new ArrayList<String>();
		try {
			String currentLine;
			br = new BufferedReader(new FileReader(f));
			while ((currentLine = br.readLine()) != null) {
				if (!currentLine.isEmpty())
					lines.add(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
		br.close();

		ArrayList<String> newLines = new ArrayList<String>();
		for (String line : lines) {
			StringTokenizer st = new StringTokenizer(line);
			String s = "n.";
			int n1 = Integer.valueOf(st.nextToken());
			int n2 = Integer.valueOf(st.nextToken());
			n1 = 465 - ((n1 - 21) * 465 / 37);
			n2 = 795 - ((n2 - 69) * 795 / 88);
			s += Integer.toString(n2) + "." + Integer.toString(n1);
			newLines.add(s);
		}

		return newLines;
	}
}
