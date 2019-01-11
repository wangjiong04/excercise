package basic.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by wangjun on 2019/1/11.
 */
public class FileContent {
    public static void main(String[] args){
        try(Stream<String> lines= Files.lines(Paths.get("c:\\test.txt"))){
            lines.filter(s -> s.length()<20).forEach(s -> System.out.println(s));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
