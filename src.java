import java.util.*;
import java.util.Scanner;
import java.io.File;
class ConverToXml {
    public static void main(String args[]) {
        
            File f1 = new File("mySample.csv");
            Scanner inputStream = new Scanner(f1);
            inputStream.useDelimiter(",");
            String header[]=  
            List<String> item = new ArrayList<String>();
            while (inputStream.hasNext()) {
                String word = inputStream.next();
                item.add(word);

                }
            String array_of_words[]= item.toArray(new String[0]);
            }  
        } 

    
