import java.util.*;
import java.util.Scanner;
import java.io.File;
import com.thoughtworks.xstream.XStream;

class ConverToXml {

    public static void main(String args[]) {

        ExtractWords obj = new ExtractWords();
        obj.getList();
        
        //this is the file where output will be writen
        String xmlOutput = "./xmlOutput.xml";

        //use xStream library to generate XML
        XStream xObject = new XStream();
        xObject.toXML(item, new FileWriter(xmlOutput));

    }
}