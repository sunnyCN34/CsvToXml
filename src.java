import java.util.*;
import java.util.Scanner;
import java.io.File;
import com.thoughtworks.xstream.XStream;
class ConverToXml {
    public static void main(String args[]) {
        
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
            //String array_of_words[]= item.toArray(new String[0]);

            XStream xObject= new XStream();
            xObject.toXML(item, new FileWriter(xmlOutput));
            }  
        } 

    
