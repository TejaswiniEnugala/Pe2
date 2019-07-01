package com.stackroute.practassign2;//program to read contents of the file
import java.io.*;

public class ReadTextFile {
    public static String readFile(File file) throws IOException {
        String line=" ";
        String rev=" ";
        int len=0;
        try{
            FileReader fr=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(fr);
            while((line=bufferReader.readLine())!=null)
            {
                rev=rev.concat(line);
            }
            len=rev.length();
        bufferReader.close();;
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        return rev.toUpperCase();
    }
}
