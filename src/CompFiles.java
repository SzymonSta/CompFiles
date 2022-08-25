/*
Comparing two files

Running this program specify in the command line names of comparing files
 */
import java.io.*;

public class CompFiles {
    public static void main(String[] args) {
        int i, j , k = 1;

        //makes sure that two filenames are given
        if(args.length != 2) {
            System.out.println("Do prawid³owego uruchomienia wymagane jest podanie dwóch nazw plików");
            return;
        }
        //Comparing the files
        try(FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1])) {
            //checking of content od both files
            do {
                i = f1.read();
                j = f2.read();
                if(i != j && i != j - 32 && i != j + 32){
                    System.out.println("Pliki ró¿ni¹ siê w miejscu " + k + " znaku.");
                    break;
                }
                k++;
            } while(i != -1 && j != -1);

            if(i != j) System.out.println("Porównywane pliki s¹ ró¿ne.");
            else System.out.println("Porównywane pliki s¹ identyczne.");
        }catch (IOException exc) {
            System.out.println("B³¹d wejœcia/wyjœcia: " + exc);
        }
    }
}
