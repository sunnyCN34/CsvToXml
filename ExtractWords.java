import java.util.*;
import java.util.Scanner;
import java.io.File;

class ExtractWords {

    //this function returns a list with words
    public getList() {

        //read the input csv file it should be in the same folder
        File f1 = new File("mySample.csv");

        Scanner inputStream = new Scanner(f1);

        //use delimiter to separate all words with comma
        inputStream.useDelimiter(",");
        String word;
        List < String > item = new ArrayList < String > ();
        while (inputStream.hasNext()) {
            word = inputStream.next();

            //add words to a new list
            item.add(word);

        }
        //return list and use it in main function to generate XML
        return item;
    }
}