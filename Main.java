import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    File inFile = new File("beemovie.txt");
    Scanner input = new Scanner(inFile);
    int lineCount = 0;
    int charCount=0;
    int wordCount=0;
    Scanner wordCounter=new scanner (inFile);
    do {

      String linea = input.nextLine();
      charCount=charCount+linea.length(); 
      System.out.println(linea);
      lineCount++;
    } while (input.hasNextLine());
    System.out.println(charCount);
    System.out.println(lineCount);
    input.close();

  }
}