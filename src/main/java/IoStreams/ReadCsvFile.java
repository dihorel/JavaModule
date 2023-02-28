package IoStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile {

    public static void main(String[] args) {
        String path="C:\\Users\\Dinu\\Downloads\\2015.csv";
        String row="";

        try {
            BufferedReader BuffReader=new BufferedReader(new FileReader(path));
            String[] entries;
            while((row=BuffReader.readLine())!=null){
                entries=row.split(",");
                System.out.println("Country: "+ entries[0]+ ", GDP: "+ entries[5]);
                }
            BuffReader.close();
        } catch (
    IOException e) {
            throw new RuntimeException(e);
        }

    }

}
