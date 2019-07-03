package com.stackroute.practassign2;//program to read contents of the file
import java.io.*;

public class ReadTextFile {
    public static String readFile(File file) throws IOException {
        String line=" ";
        String string=" ";
        try{
            FileReader fr=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(fr);
            while((line=bufferReader.readLine())!=null)
            {
                string=string.concat(line);
            }
        bufferReader.close();;
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        return string.toUpperCase();
    }
}
