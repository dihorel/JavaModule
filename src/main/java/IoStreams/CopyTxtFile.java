package IoStreams;

import java.io.*;

public class CopyTxtFile {
    public static void main(String[] args) {

        try {
            BufferedReader BuffReader=new BufferedReader(new FileReader("C:\\Users\\Dinu\\Downloads\\java.txt"));
            BufferedWriter BuffWriter=new BufferedWriter(new FileWriter("C:\\Users\\Dinu\\Downloads\\java1.txt"));

            String entry;
            while((entry=BuffReader.readLine())!=null){
                BuffWriter.write(entry);
            }

            BuffReader.close();
            BuffWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
