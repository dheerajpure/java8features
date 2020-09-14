package dp.java7.feture.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

	public static void main(String[] args) {
		Path newDirectoryPath = Paths.get("c:/temp/temp_delete_this");
		 
		if (!Files.exists(newDirectoryPath)) {
		    try {
		        Files.createDirectory(newDirectoryPath);
		    } catch (IOException e) {
		        System.err.println(e);
		    }
		}
	}

}