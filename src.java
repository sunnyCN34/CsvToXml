import java.util.*;
import java.util.Scanner;
import java.io.File;
import com.thoughtworks.xstream.XStream;
class ConverToXml {
    public static void main(String args[]) {
        
            ExtractWords obj= new ExtractWords();
            obj.getList();
            //String array_of_words[]= item.toArray(new String[0]);

            XStream xObject= new XStream();
            xObject.toXML(item, new FileWriter(xmlOutput));
            }  
        } 

    
