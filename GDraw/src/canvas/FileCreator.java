package canvas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileCreator {

	public FileCreator() {

	}

	public static void write(File f, ArrayList<String> lines)
			throws IOException {
		FileWriter fw = new FileWriter(f);
		for (String line : lines)
			fw.write(line + "\n");
		fw.close();
	}

}
