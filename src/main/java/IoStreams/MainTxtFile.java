package IoStreams;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTxtFile {

    private static final Logger log= Logger.getLogger("MyLog");
    public static void main(String[] args) {
        try {

            Log newLog=new Log("C:\\Users\\Dinu\\Downloads\\logfile.log");
            newLog.log1.setLevel(Level.INFO);
            newLog.log1.warning("Create new file");

            BufferedWriter BuffWriter=new BufferedWriter(new FileWriter("C:\\Users\\Dinu\\Downloads\\java.txt"));
            BuffWriter.write("Ana are mere");
            BuffWriter.newLine();
            BuffWriter.append("Ion");

            BuffWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            BufferedReader BuffReader=new BufferedReader(new FileReader("C:\\Users\\Dinu\\Downloads\\java.txt"));
            String read;
            while((read=BuffReader.readLine())!=null){
                System.out.println(read);
            }
            BuffReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
