package dp.java7.feture.nio;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.PatternSyntaxException;

public class ListDirectory {

    public static void main(String[] args) {
       
        Path dir = Paths.get("c:/temp/");
        String filter = "*.PNG";
        
        try (DirectoryStream<Path> stream =
                Files.newDirectoryStream(dir, filter)) {
            for (Path file : stream) {
                System.out.println(file.getFileName());
            }
        } catch (PatternSyntaxException | DirectoryIteratorException | IOException x) {
            //IOException can never be thrown by the iteration.
            //In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }
    }
}