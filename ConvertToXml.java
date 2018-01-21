import java.util.*;
import java.util.Scanner;
import java.io.File;
import com.thoughtworks.xstream.XStream;

class ConvertToXml {

    public static void main(String args[]) {

        ExtractWords obj = new ExtractWords();
        
        //this is the file where output will be writen
        String xmlOutput = "./xmlOutput.xml";

        //use xStream library to generate XML
        XStream xObject = new XStream();
        xObject.toXML(obj.getList(), new FileWriter(xmlOutput));

    }
}