import java.util.*;
import java.util.Scanner;
import java.io.File;
class ExtractWords {
    public getList() {
        
            File f1 = new File("mySample.csv");
            String xmlOutput= "./xmlOutput.xml";
            Scanner inputStream = new Scanner(f1);
            inputStream.useDelimiter(",");
            String word; 
            List<String> item = new ArrayList<String>();
            while (inputStream.hasNext()) {
                 word = inputStream.next();
                item.add(word);

                }
                return item;
            }
        }