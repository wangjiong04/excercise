package basic.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by wangjun on 2019/1/11.
 */
public class FolderStream {
    public static void main(String[] args){
        try(Stream<Path> list= Files.list(Paths.get("c:\\photo"))){
            list.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
        try(Stream<Path> list= Files.walk(Paths.get("c:\\photo"))){
            list.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
        try(Stream<Path> list= Files.find(Paths.get("c:\\photo"),Integer.MAX_VALUE,(path,attributes)->path.toString().contains("1911"))){
            list.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
