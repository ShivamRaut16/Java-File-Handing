import java.util.*;
import java.io.*;

class FileIO {
    public static void main(String[] args) throws IOException  
    {   Scanner sc = new Scanner(System.in);

        //write content in the file 
        FileWriter filein = new FileWriter ("Source.txt");
        System.out.println("Enter the Content in File 1 :");
        String input = sc.nextLine();
        filein.write(input);
        filein.flush();

        //read content in a file
        FileReader fileout = new FileReader ("Source.txt");
        int x;
        System.out.println("Content Present in the file : ");
        while((x=fileout.read())!= -1){
            char y;
            y = (char) x;
            System.out.print(y);
        }
            fileout.close();

        
        //Copy the content from file1 to file2
        FileReader fin = new FileReader ("Source.txt");
        FileWriter fout = new FileWriter ("Destination.txt");

        while((x=fin.read())!= -1){
            char y;
            y = (char) x;
            fout.write(y);

        }
        
        fin.close();
        fout.close();
        System.out.println(" \n SuccessFully Copy the content  ");

    }
}
