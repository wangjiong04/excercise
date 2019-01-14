package basic.TryWithResource;

import java.awt.SystemTray;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResource1 {
    public static void main(String[] args){
        try {
            copy("c:\\projects\\test.txt", "c:\\projects\\test1.txt");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void  copy(String source,String dest) throws IOException{
        try(InputStream in=new FileInputStream(source);OutputStream out=new FileOutputStream(dest)){
            byte[] buf=new byte[1000];
            int n;
            while ((n=in.read(buf))>=0){
                out.write(buf,0,n);
            }
        }
    }
    private static String read(String source){
        try(BufferedReader in =new BufferedReader(new FileReader(source))){
            return in.readLine();
        }
        catch(IOException ex){
            return "";
        }
    }
}
