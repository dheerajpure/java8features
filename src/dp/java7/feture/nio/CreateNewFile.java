package dp.java7.feture.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateNewFile {

	public static void main(String[] args) {
		Path newFilePath = Paths.get("C:/temp", "_empty_file.txt");
		 
		if (!Files.exists(newFilePath)) {
		    try {
		        Files.createFile(newFilePath);
		    } catch (IOException e) {
		        System.err.println(e);
		    }
		}
	}

}