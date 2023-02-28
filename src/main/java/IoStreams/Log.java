package IoStreams;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

    public Logger log1;
    FileHandler fh;
    public Log(String filename) throws SecurityException, IOException{
        File logFile =new File(filename);
        if(! logFile.exists()){
            logFile.createNewFile();
        }
        fh=new FileHandler(filename,true);
        log1=Logger.getLogger("logging");
        log1.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);


    }
}
